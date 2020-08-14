package com.study.springboot.pattern.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStockOrder buyStockOrder = new BuyStockOrder(abcStock);
        SellStockOrder sellStockOrder = new SellStockOrder(abcStock);

        Broker broker = new Broker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);

        broker.runOrders();
    }
}
