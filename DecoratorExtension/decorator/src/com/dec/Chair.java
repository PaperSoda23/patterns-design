package com.dec;


import com.dec.decorators.IWeightable;
import com.dec.entity.ISitter;

public class Chair implements IChair, IWeightable {
    protected ISitter sitter = null;
    protected double weight;

    public boolean sitOn(ISitter sitter) {
        if (sitter == null) return false;
        else this.sitter = sitter;
        return true;
    }

    @Override
    public int move(DirectionType direction, int distance) {
        if (weight > 30) return 30 * distance;
        if (weight > 20) return 20 * distance;
        return 10 * distance;
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
