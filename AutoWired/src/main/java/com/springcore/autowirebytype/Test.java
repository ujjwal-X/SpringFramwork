package com.springcore.autowirebytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowirebytype.xml");
//        Employe emp1= applicationContext.getBean("employe", Employe.class);
//        System.out.println(emp1);
//
//
        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("autowirebytype.xml");
        Employe employe=applicationContext1.getBean("employe1", Employe.class);
        System.out.println(employe);

//        ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("autowirebytype.xml");
//        Employe employe1=applicationContext2.getBean("employe2", Employe.class);
//        System.out.println(employe1);

    }
}
