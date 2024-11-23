package componentannotation.beanclass;

import org.springframework.stereotype.Component;


public class OrderId {
    private int id;
    private String orderStatus;


    OrderId(){
        System.out.println("OrderId object is created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
