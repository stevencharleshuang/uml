package com.generalassembly.uml.classes;

public class Asset {

    private int id;
    private double shares;
    private double purchasePrice;

    Asset(int id, double shares, double purchasePrice) {
        this.id = id;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
    }

    public int getId() {
        return id;
    }

    public double getShares() {
        return shares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    protected double calculateValue(double val) {
        return val;
    }

}
