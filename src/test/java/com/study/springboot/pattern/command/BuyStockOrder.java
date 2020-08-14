package com.study.springboot.pattern.command;

public class BuyStockOrder implements Order {
    private Stock abcStock;

    public BuyStockOrder(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
