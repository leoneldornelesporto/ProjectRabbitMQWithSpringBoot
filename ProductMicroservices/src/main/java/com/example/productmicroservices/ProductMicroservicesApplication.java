package com.example.productmicroservices;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableRabbit
@EnableCaching
public class ProductMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMicroservicesApplication.class, args);
    }

}
