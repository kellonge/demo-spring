package com.kellonge.demo.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定义一个bean的多个实例
 * 
 * @author kellonge
 * @version $Id: MutilBeanConfig.java, v 0.1 2016年5月13日 下午3:06:27 kellonge Exp $
 */
@Configuration
public class MutilBeanConfig {

    @Bean(name = "sswBean")
    public NameBean sswBean() {
        NameBean sswBean = new NameBean();
        sswBean.setName("ssw");
        return sswBean;
    }

    @Bean(name = "manaBean")
    public NameBean manaBean() {
        NameBean manaBean = new NameBean();
        manaBean.setName("mana");
        return manaBean;
    }
}
