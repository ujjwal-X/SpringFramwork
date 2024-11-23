package autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Employee {
    private int emno;
    private double salary;
    private String name;
    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "emno=" + emno +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee(int emno, double salary, String name, Address address) {
        this.emno = 1;
        this.salary = 15000;
        this.name = "Shiv";
        this.address = address;
    }
    Employee(){
        System.out.println("Emp is created");
    }
}
