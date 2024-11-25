package flipkart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flipkart_orders")
public class FlipakartOrder {

    @Id
    @Column(name = "orderId") // Primary key column
    private Long orderID;

    @Column(name = "productName")
    private String productName;

    @Column(name = "TOTALAMOUNT")
    private double totalAmount;

    public long getOrderID() {
        return orderID;
    }
    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
