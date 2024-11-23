package com.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.scan("com.spring.jdbc");
        context.refresh();
        StudentDbOperations operations= context.getBean(StudentDbOperations.class);
//        operations.addStudnet(null);
        operations.deleteStudent(null);
    }
}
