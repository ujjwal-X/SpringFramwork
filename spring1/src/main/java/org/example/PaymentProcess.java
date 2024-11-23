package org.example;

public class PaymentProcess {
    private Ipay pay;
    public  void setPay(Ipay pay){
        System.out.println("setter is called");
        this.pay=pay;
    }
    public  PaymentProcess( Ipay pay){
        this.pay=pay;
        System.out.println("PP object is creating");
    }

    public  void doPayment(Double amt){
        boolean paymentDone=pay.payBill(amt);
        if(paymentDone){
            System.out.println("payment sucess");
        }
        else {
            System.out.println( "Payment Failed");
        }
    }
}
