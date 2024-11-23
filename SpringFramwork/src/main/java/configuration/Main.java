package configuration;

import configuration.beanclass.Product;
import configuration.beanclass.Student;
import configuration.beanconfiguration.BeanConfiguration;
import configuration.beanconfiguration.ProductConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Student s= applicationContext.getBean("student", Student.class);

        System.out.println(s);

        Student s1= applicationContext.getBean("student", Student.class);

        System.out.println(s1);


// if you don't want to write in this manner here is the second way using register
//        AnnotationConfigApplicationContext product=new AnnotationConfigApplicationContext(ProductConfiguration.class);
        AnnotationConfigApplicationContext product=new AnnotationConfigApplicationContext();
        product.register(ProductConfiguration.class);
        product.refresh();

        Product pc=product.getBean("item1",Product.class);

        System.out.println(pc);


    }
}
