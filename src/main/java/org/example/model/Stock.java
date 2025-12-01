package org.example.model;

public class Stock extends Asset{

    public Stock(String symbol, int shares, double avgBuyPrice) {
        super(symbol, shares, avgBuyPrice);
        this.type = "STOCK";
    }

    @Override
    public double getRiskFactor() {
        return 0.8; // High risk for stocks
    }
}
