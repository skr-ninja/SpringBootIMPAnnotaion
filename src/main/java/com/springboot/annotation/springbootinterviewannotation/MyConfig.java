package com.springboot.annotation.springbootinterviewannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = {"mypack"})
public class MyConfig {

    @Bean("getstudent")
    @Lazy
    public Student getStudent(){
        System.out.println("Get Student Bean Object");
        return new Student("Get Student");
    }

    @Bean("createstudent")
    @Lazy
    public Student createStudent(){
        System.out.println("Create Student Bean Object");
        return new Student("Create Student");
    }

    @Bean
    public Date getDate(){
        return new Date();
    }
}
