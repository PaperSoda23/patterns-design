package com.dec;


import com.dec.entity.ISitter;

public class Chair implements IChair {
    protected ISitter sitter = null;
    protected double weight;

    public boolean sitOn(ISitter sitter) {
        if (sitter == null) return false;
        else this.sitter = sitter;
        return true;
    }

    public void move(Direction direction, int distance) {
        System.out.println("moving chair in " + direction.toString() + " direction by " + distance) ;
    }

    public void addWeight(double weight) {
        this.weight += weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean hasSitter() {
        return sitter != null;
    }
}
