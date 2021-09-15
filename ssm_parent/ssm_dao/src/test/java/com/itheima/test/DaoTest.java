package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @Author：shenkunlin
 * @date： 2021/9/13 11:05
 * @Description：
 ***/
public class DaoTest {

    public static void main(String[] args) {
        //1)创建容器对象
        ApplicationContext act = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //2)从容器对象中获取Dao
        ItemsDao itemsDao = act.getBean(ItemsDao.class);

        //3)使用Dao实现增加、查询
        List<Items> all = itemsDao.findAll();
        for (Items items : all) {
            System.out.println(items);
        }


        Items items = new Items();
        items.setName("javaEE 118");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
