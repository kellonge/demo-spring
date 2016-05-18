package com.kellonge.demo.spring.cache;

import java.util.ArrayList;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建缓存配置，定义一个default的ConcurrentMapCache
 * 
 * @author kellonge
 * @version $Id: CacheConfig.java, v 0.1 2016年5月18日 下午8:34:57 kellonge Exp $
 */
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {

    @Bean
    @Override
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        ArrayList<ConcurrentMapCache> arrayList = new ArrayList<>();
        arrayList.add(new ConcurrentMapCache("default"));
        cacheManager.setCaches(arrayList);
        return cacheManager;
    }
}
