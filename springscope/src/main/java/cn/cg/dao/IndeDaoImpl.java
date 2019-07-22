package cn.cg.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @title: indeDaoImpl
 * @projectName workspace_idea
 * @description: TODO
 * @date 2019/7/233:37
 */
@Repository(value = "indexDao")
@Scope(value = "prototype")
public class IndeDaoImpl implements IndexDao {
    @Override
    public void get() {
        System.out.println("dao"+this.hashCode());
    }
}
