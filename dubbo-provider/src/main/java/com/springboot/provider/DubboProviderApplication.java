package com.springboot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class DubboProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
