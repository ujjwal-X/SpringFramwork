package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("Dependency.xml");

        Student s=ap.getBean("student",Student.class);
        s.cheating();
        System.out.println(s);
    }
}
