package cn.cg.strategy.duck;

import org.junit.Test;

/**
 * @author Administrator
 * @title: MainClass
 * @projectName workspace_idea
 * @description: TODO
 * @date 2019/6/2710:39
 */
public class MainClass {
    @Test
    public void fun1(){
        Duck gduck = new GreenHeadDuck();
        gduck.shout();
    }
}
