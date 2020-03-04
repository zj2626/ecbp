package com.github.ecbp.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Config {
    /* http://{ip}:{port}/swagger-ui.html */

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.github.ecbp.store.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /*基本的信息*/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringCloud api文档")
                .description("简单优雅的restfun风格，https://github.com/zj2626/ecbp")
                .termsOfServiceUrl("https://github.com/zj2626/ecbp")
                .version("1.0")
                .build();
    }
}
