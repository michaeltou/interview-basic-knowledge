package com.example.demo;

import com.example.demo.aop.Figure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo3Application.class, args);
        Figure figure =  (Figure)applicationContext.getBean("PengYuYan");
        figure.skill();
    }

}
