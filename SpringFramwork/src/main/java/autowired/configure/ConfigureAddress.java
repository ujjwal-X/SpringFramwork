package autowired.configure;

import autowired.bean.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class ConfigureAddress {

    @Bean("home")
    public Address getAddress(){
        Address address=new Address("Bhopal","Mp",100);
        return address;
    }
}
