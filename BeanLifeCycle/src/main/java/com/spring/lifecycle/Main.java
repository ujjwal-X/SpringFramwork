package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext   we use AbstractApplicationContext because it contains shutdown bean method registerShutdownHook
//          AbstractApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
//
//        Student s= (Student) context.getBean("student");
//        System.out.println(s);
//        context.registerShutdownHook();


        //using interface InitializationBean DisposableBean
//        AbstractApplicationContext context1= new ClassPathXmlApplicationContext("config.xml");
//        context1.getBean("pepsi");
//        context1.registerShutdownHook();
        AbstractApplicationContext context2=new ClassPathXmlApplicationContext("config.xml");
        Example e= (Example) context2.getBean("example");
        System.out.println(e);
        context2.registerShutdownHook();
    }
}
