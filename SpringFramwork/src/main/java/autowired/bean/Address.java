package autowired.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("office")@Primary
public class Address {
    String city;
    String state;
    int streetNumber;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }

    public Address(String city, String state, int streetNumber) {
        this.city = city;
        this.state = state;
        this.streetNumber = streetNumber;
    }
    Address(){
        System.out.println("Address is created");
    }
}
