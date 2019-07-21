package cn.cg.factory.abstractFactory;


public class SouthBanana implements Fruit {
    @Override
    public void getFruit() {
        System.out.println(NorthApple.class.getName());
    }
}
