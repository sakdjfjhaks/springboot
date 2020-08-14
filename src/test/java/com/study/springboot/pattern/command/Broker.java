package com.study.springboot.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void runOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
