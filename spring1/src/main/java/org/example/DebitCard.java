package org.example;

public class DebitCard implements Ipay {

    public  DebitCard(){
        System.out.println("Debit card object is creating in ioc");
    }
    public boolean payBill(Double amt){
        System.out.println("Paying bill thorugh Debit card");
        return true;
    }
}
