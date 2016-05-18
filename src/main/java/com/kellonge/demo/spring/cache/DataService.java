package com.kellonge.demo.spring.cache;

import java.util.Date;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * 带缓存的模拟服务层
 * 
 * @author kellonge
 * @version $Id: DataService.java, v 0.1 2016年5月18日 下午8:37:19 kellonge Exp $
 */
@Component
public class DataService {

    @Cacheable("default")
    public Date getServiceDate() {
        return DataSource.getDate();
    }
}
