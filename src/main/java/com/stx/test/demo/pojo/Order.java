package com.stx.test.demo.pojo;

public class Order {
    private  Integer oId;
    private  double oPrice;

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", oPrice=" + oPrice +
                ", cId='" + cId + '\'' +
                '}';
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public double getoPrice() {
        return oPrice;
    }

    public void setoPrice(double oPrice) {
        this.oPrice = oPrice;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    private  String cId;
}
