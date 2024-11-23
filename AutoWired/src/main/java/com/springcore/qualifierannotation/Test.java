package com.springcore.qualifierannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("QualifierConfig.xml");

        Employe emp1= applicationContext.getBean("employe", Employe.class);

        System.out.println(emp1);




    }
}
