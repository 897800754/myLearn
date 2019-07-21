package cn.cg.factory.abstractFactory;


public class SouthApple implements Fruit {
    @Override
    public void getFruit() {
        System.out.println(SouthApple.class.getName());
    }
}
