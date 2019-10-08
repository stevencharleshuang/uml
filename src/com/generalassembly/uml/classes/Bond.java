package com.generalassembly.uml.classes;

public class Bond extends Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    Bond(int id, double shares, double purchasePrice) {
        super(id, shares, purchasePrice);
    }
}
