package beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        BeanFactory beanFactory=new ClassPathXmlApplicationContext("BeanFactory.xml");
        Student s1= beanFactory.getBean("student", Student.class);
        System.out.println(s1);

//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeanFactory.xml");
//        Student s1=applicationContext.getBean("student", Student.class);
//        System.out.println(s1);
    }
}
