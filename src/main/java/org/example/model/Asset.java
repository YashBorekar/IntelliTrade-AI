package org.example.model;

public abstract class Asset {
    private String symbol;
    protected int shares;
    private double avgBuyPrice;
    private double currentPrice;
    protected String type;

    public Asset(String symbol, int shares, double avgBuyPrice) {
        this.symbol = symbol;
        this.shares = shares;
        this.avgBuyPrice = avgBuyPrice;
    }

    // Getters (Encapsulation)
    public String getSymbol() {
        return symbol;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getAvgBuyPrice() {
        return avgBuyPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public String getType() {
        return type;
    }

    public double getCurrentValue() {
        return currentPrice;
    }

    // Setter
    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    // Abstract method for Polymorphism
    public abstract double getRiskFactor();

    @Override
    public String toString() {
        return String.format("Asset{symbol='%s', shares=%d, value=%.2f}",
                symbol, shares, getCurrentValue());
    }
}
