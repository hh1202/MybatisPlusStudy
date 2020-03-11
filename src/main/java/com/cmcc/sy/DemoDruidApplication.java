package com.cmcc.sy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @anthor huanghao
 * Created on 2020/3/9 19:56
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.cmcc.sy.mapper")
public class DemoDruidApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDruidApplication.class, args);
    }
}
