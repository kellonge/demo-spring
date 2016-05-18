package com.kellonge.demo.spring.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 缓存示例
 * 三次请求带缓存处理的方法
 * 
 * @author kellonge
 * @version $Id: CacheMain.java, v 0.1 2016年5月18日 下午8:35:27 kellonge Exp $
 */
@Configuration
@ComponentScan
public class CacheMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CacheMain.class);
        DataService dataService = context.getBean(DataService.class);
        System.out.println(dataService.getServiceDate());
        System.out.println(dataService.getServiceDate());
        System.out.println(dataService.getServiceDate());
    }
}
