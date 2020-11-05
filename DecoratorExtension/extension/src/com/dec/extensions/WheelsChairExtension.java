package com.dec.extensions;

import com.dec.DirectionType;
import com.dec.IChair;

public class WheelsChairExtension implements IChairExtension {
    private IChair chair;
    private double weight;

    public WheelsChairExtension(IChair chair, double weight) {
        this.chair = chair;
        this.weight = weight;
    }

    public int move(DirectionType directionType, int distance, int time) {
        System.out.println("moving on wheels");
        return time - 7;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
