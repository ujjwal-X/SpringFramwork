package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



 class Pepsi  implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking Pespi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bottle Destroying");
    }


}
