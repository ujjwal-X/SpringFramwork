package configuration.beanconfiguration;

import configuration.beanclass.Student;
import org.springframework.context.annotation.Bean;

//@Configuration
public class BeanConfiguration {

    @Bean(name = "student")
    public Student getStudent(){
        return new Student();
    }
}
