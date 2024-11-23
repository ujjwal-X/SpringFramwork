package dependentobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("DependentObject.xml");

         Employee e1=applicationContext.getBean("employee", Employee.class);

        System.out.println(e1);

    }
}
