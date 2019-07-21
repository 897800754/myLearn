package cn.cg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
委托对象
 */
public class DynamicProxy implements InvocationHandler {
    //目标对象
    private Object target;
    //传入目标对象的入口,也可以是set方法
    public DynamicProxy(Object target){
        this.target = target;
    }
    /**
     * 覆盖java.lang.reflect.InvocationHandler的方法invoke()进行织入(增强)的操作。
     * 这个方法是给代理对象调用的，留心的是内部的method调用的对象是目标对象，可别写错。
     * 参数说明：
     * proxy是生成的代理对象，
     * method是代理的方法，
     * args是方法接收的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----before----");
        Object invoke = method.invoke(target, args);
        System.out.println("----after----");
        return invoke;

    }

    public static void main(String[] args) {
        //希望被代理的目标业务类
        UserService target = new UserServiceImpl();
        // //将目标类和横切类编织在一起
        DynamicProxy handler = new DynamicProxy(target);
        //创建代理实例，它可以看作是要代理的目标业务类的加多了横切代码(方法)的一个子类
        //创建代理实例(使用Proxy类和自定义的调用处理逻辑(handler)来生成一个代理对象)
        UserService proxy = (UserService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                return null;
            }
        });
        proxy.add();
    }
}
