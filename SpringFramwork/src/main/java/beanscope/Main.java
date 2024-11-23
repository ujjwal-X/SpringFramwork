package beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("BeanScope.xml");
        Order o=context.getBean("order",Order.class);
        System.out.println(o);

        Order o1=context.getBean("order",Order.class);
        System.out.println(o1);
    }
}
