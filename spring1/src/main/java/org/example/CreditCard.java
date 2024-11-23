package org.example;

public class CreditCard implements  Ipay{
    public CreditCard(){
        System.out.println("Credit card object is creating in ioc");

    }

    public boolean payBill(Double amt){
        System.out.println("Paying bill thorugh credit card");
        return true;
    }

}
