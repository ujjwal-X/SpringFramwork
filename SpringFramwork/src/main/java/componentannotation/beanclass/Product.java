package componentannotation.beanclass;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("componentannotation.infosys;")
public class Product {
    Product(){
        System.out.println("Product object is created");
    }
}
