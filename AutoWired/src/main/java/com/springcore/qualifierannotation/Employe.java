package com.springcore.qualifierannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employe {
    @Autowired
    @Qualifier("add1")
    private Address address;
    Employe(){

    }
    Employe(Address address){
        System.out.println("Constructor method is called");
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "address=" + address +
                '}';
    }

    public void setAddress(Address address) {
        System.out.println("Setter method is called");
        this.address = address;
    }
}
