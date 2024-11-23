package configuration.beanconfiguration;

import configuration.beanclass.Product;
import org.springframework.context.annotation.Bean;

public class ProductConfiguration {
    @Bean(name = "item1")
    public Product getProduct(){
        Product p=new Product();
        p.setProductId("1");
        p.setProductPrice("200");
        p.setProductName("Keyboard");
        return p;

    }
}
