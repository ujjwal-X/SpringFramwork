package com.springcore.autowirebyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowirebyname.xml");

        Employe e=applicationContext.getBean("employe", Employe.class);

        Address a=applicationContext.getBean("address",Address.class);

        System.out.println(a);

        System.out.println(e);
    }
}
