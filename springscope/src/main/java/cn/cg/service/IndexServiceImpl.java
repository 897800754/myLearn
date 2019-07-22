package cn.cg.service;

import cn.cg.dao.IndexDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @title: IndexServiceImpl
 * @projectName workspace_idea
 * @description: TODO
 * @date 2019/7/233:39
 */
@Service
public abstract class IndexServiceImpl implements IndexService/*,ApplicationContextAware*/ {
   /* @Autowired
    private IndexDao indexDao;*/
    //private ApplicationContext ac;
    @Override
    public void get() {
        /*indexDao.get();*/
        /*IndexDao bean = ac.getBean(IndexDao.class);
        bean.get();*/
        IndexDao indexDao = createIndexDao();
        indexDao.get();
    }
    @Lookup()
    protected abstract IndexDao createIndexDao();

   /* @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac = applicationContext;
    }*/
}
