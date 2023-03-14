package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot05LogApplication {

    public static void main(String[] args) {
        //禁用热部署
        System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(Springboot05LogApplication.class, args);
    }

}
