package com.study.springboot.pattern.command;

public class SellStockOrder implements Order {
    private Stock abcStock;

    public SellStockOrder(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
