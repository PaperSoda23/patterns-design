package com.dec.extensions;

import com.dec.IChair;

public class BackrestChairExtension implements IChairExtension {
    private boolean isLeaning = false;
    private int angle = 0;
    private IChair chair;
    private double weight;

    public BackrestChairExtension(IChair chair, int weight) {
        this.chair = chair;
        this.weight = weight;
    }

    public void lean(int angle) {
        isLeaning = true;
        this.angle = angle;
        System.out.println("leaning at " + angle);
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
