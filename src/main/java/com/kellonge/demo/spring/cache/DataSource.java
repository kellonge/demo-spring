package com.kellonge.demo.spring.cache;

import java.util.Date;

/**
 * 模拟数据源，通过Thread.sleep模拟查询时间
 * 
 * @author kellonge
 * @version $Id: DataSource.java, v 0.1 2016年5月18日 下午8:37:45 kellonge Exp $
 */
public class DataSource {

    public static Date getDate() {
        Date now = new Date();
        System.out.println("get from datasource .....");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
        }
        System.out.println("get data. date:" + now);
        return now;
    }

}
