package com.generalassembly.uml.classes;

public class Stock extends Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    Stock(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
    }
}
