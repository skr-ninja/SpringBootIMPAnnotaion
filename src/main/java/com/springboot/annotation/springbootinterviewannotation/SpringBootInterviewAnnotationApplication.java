package com.springboot.annotation.springbootinterviewannotation;

import mypack.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
public class SpringBootInterviewAnnotationApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("createstudent")
    private  Student student;

    @Autowired
    private Date date;

    @Autowired
    Employee employee;

    @Autowired
    Animal animal;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootInterviewAnnotationApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        student.studying();
        employee.getName();
        animal.typeofAnimal();
    }
}
