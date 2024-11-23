package componentannotation.main;

import componentannotation.beanclass.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.scan("componentannotation.beanclass.");
        applicationContext.refresh();

        Product p=applicationContext.getBean(Product.class);

        System.out.println(p);

        Product p1= (Product) applicationContext.getBean("product");

        System.out.println(p1);

    }
}
