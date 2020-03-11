package com.cmcc.sy.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.logging.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.logging.Logger;

/**
 * @anthor huanghao
 * Created on 2020/3/9 19:40
 * @Description:
 */
@Slf4j
@Configuration
@EnableTransactionManagement
public class MyBatisPlusConfig {

    /**
     * @description: 配置分页插件
     *
     * @author: gradual
     * @date: 2019/1/15 10:17
     * @param: []
     * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        log.debug("注册分页插件");
        return new PaginationInterceptor();
    }

    /**
     * @description: SQL执行效率插件
     *
     * @author: gradual
     * @date: 19-1-24 下午4:59
     * @param: []
     * @return: com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor
     */
    @Bean
    @Profile({"test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 逻辑删除用，3.1.1之后的版本可不需要配置该bean，但项目这里用的是3.1.0的
     *
     * @author David Hong
     *
     * @return com.baomidou.mybatisplus.core.injector.ISqlInjector
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }


    /**
     * @Author：huanghao on 2020/3/10 17:23
     * @param: []
     * @return: com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor
     * @Despriction: 乐观锁插件配置
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}

