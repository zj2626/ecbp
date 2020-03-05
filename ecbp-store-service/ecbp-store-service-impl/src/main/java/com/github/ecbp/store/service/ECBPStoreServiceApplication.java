package com.github.ecbp.store.service;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ********************
 * install command: clean install -D profiles.active=test -D maven.javadoc.skip=true -D maven.test.skip=true
 * ********************
 * run command:     spring-boot:run -D profiles.active=test
 * ********************
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@MapperScan(basePackages = "com.github.ecbp.store.service.mapper")
public class ECBPStoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECBPStoreServiceApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}

/*
 * Dashboard 访问地址:http://{ip}:{port}/hystrix
 * Dashboard-Stream 地址:http://{ip}:{port}/hystrix.stream
 * */
