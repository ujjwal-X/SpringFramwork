package beanscope;

public class Order {

    private String status;

    private Product product;

    public Order() {
    }

    public Order(String status, Product product) {
        this.status = status;
        this.product = product;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
