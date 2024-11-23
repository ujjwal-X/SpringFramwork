package org.primitive;

import org.collections.Employee;
import org.constructorinjector.Person;
import org.references.A;
import org.references.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Student student1=(Student) context.getBean("student1");

        System.out.println(student1);

        Student student2=(Student) context.getBean("student2");

        System.out.println(student2);



        ApplicationContext context1= new ClassPathXmlApplicationContext("config.xml");

        Employee e=(Employee) context1.getBean("emp1");

        System.out.println(e);


        ApplicationContext context2= new ClassPathXmlApplicationContext("config.xml");

        B b= (B) context2.getBean("bref");

        System.out.println(b);

        A a=(A)context2.getBean("aref");

        System.out.println(a);


//        constructor injector

        ApplicationContext constructor=new ClassPathXmlApplicationContext("config.xml");

       Person p= (Person) constructor.getBean("person");

        System.out.println(p);
    }
}