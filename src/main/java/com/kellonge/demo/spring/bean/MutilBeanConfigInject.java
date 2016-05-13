package com.kellonge.demo.spring.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MutilBeanConfigInject {

    //使用类型注入，如果同个类型有多个实例，会按照field的名字去scan，如果没找到报错
    @Autowired
    NameBean sswBean;
    //使用类型注入，并按名称筛选
    @Autowired
    @Qualifier("sswBean")
    NameBean nameBean;
    //使用按名称注入
    @Resource(name = "sswBean")
    NameBean resourceNameBean;

    public void pringInject() {
        System.out.println("@Autowired by FileName |bean value:" + sswBean.getName());
        System.out.println("@Autowired by @Qualifier |bean value:" + nameBean.getName());
        System.out.println("@Resource by name |bean value:" + resourceNameBean.getName());
    }

}
