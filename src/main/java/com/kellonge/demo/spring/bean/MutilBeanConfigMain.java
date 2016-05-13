package com.kellonge.demo.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 1.全注解spring配置
 * 2.一个类型的bean多个实例的注入
 * 
 * @author kellonge
 * @version $Id: MutilBeanConfigMain.java, v 0.1 2016年5月13日 下午3:16:36 kellonge Exp $
 */
@Configuration
@ComponentScan
public class MutilBeanConfigMain {

    /**
     * 程序入口
     * 
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MutilBeanConfigMain.class);
        MutilBeanConfigInject mutilBeanConfigInject = context.getBean(MutilBeanConfigInject.class);
        mutilBeanConfigInject.pringInject();
    }

}
