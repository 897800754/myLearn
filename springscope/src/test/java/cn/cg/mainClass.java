package cn.cg;

import cn.cg.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @title: main
 * @projectName workspace_idea
 * @description: TODO
 * @date 2019/7/233:44
 */
public class mainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexService bean1 = ac.getBean(IndexService.class);
        bean1.get();
        IndexService bean2 = ac.getBean(IndexService.class);
        bean2.get();
    }
}
