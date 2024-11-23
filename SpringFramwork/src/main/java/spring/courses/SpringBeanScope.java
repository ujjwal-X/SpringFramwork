package spring.courses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
        app.scan("spring");
        app.refresh();
        CourseDetails cd=app.getBean(CourseDetails.class);
        System.out.println(cd);
//
//        CourseDetails cd1=app.getBean(CourseDetails.class);
//        System.out.println(cd1);

        CourseDetails cd2= (CourseDetails) app.getBean("course1");
        System.out.println(cd2);

    }
}
