package com.generalassembly.uml.classes;

public class Commodity extends Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    Commodity(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
    }
}
