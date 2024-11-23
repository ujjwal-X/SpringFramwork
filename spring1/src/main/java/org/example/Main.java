package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        old way
//        Resource resource=new ClassPathResource("config.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);

//        new way
        ApplicationContext factory=new ClassPathXmlApplicationContext("config.xml");

        CreditCard c=(CreditCard) factory.getBean("credit",CreditCard.class);
        factory.getBean("debit",DebitCard.class);
        System.out.println(c.payBill(100.0));
        PaymentProcess process=factory.getBean("paying",PaymentProcess.class);
        process.doPayment(100000.0);


    }

}