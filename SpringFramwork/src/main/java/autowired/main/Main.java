package autowired.main;


import autowired.configure.ConfigureAddress;
import dependentobject.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext emp1=new AnnotationConfigApplicationContext();
        emp1.register(ConfigureAddress.class);
        emp1.scan("autowired");
        emp1.refresh();
        Employee e=emp1.getBean(Employee.class);
        System.out.println(e);
    }
}
