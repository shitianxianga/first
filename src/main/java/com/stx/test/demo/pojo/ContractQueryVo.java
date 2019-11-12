package com.stx.test.demo.pojo;

import java.util.List;

public class ContractQueryVo {

  private   Contract contract;
  private List<Order> orders;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
