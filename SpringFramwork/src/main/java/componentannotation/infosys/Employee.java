package componentannotation.infosys;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee {
    private String name;
    private  double salary;

    Employee(){
        System.out.println("Employe joined");
    }
}
