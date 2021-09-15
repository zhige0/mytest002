package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：shenkunlin
 * @date： 2021/9/13 11:19
 * @Description：
 ***/
public class ServiceTest {

    public static void main(String[] args) {
        //1）创建容器对象
        ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
        //2）从容器中获取ItemService代理对象
        ItemsService itemsService = act.getBean(ItemsService.class);

        //3）执行增加操作
        Items items = new Items();
        items.setName("测试事务66778899");
        itemsService.save(items);
    }
}
