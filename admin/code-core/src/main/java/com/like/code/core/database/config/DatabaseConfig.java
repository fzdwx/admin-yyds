package com.like.code.core.database.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.like.code.core.database.interceptor.MyBatisSqlLogInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 数据库以及mybatis相关配置
 *
 * @author like
 * @date 2021/5/21 10:41
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    /**
     * mybatis plus sql 拦截器
     *
     * @return {@link MybatisPlusInterceptor}
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MyBatisSqlLogInterceptor mybatisPlusInterceptor = new MyBatisSqlLogInterceptor();
        return mybatisPlusInterceptor;
    }
}
