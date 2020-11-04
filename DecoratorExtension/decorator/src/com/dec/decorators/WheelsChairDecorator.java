package com.dec.decorators;

import com.dec.ChairDecorator;
import com.dec.Direction;
import com.dec.IChair;
import com.dec.entity.ISitter;
import com.dec.decorators.wheels.IWheels;

public class WheelsChairDecorator extends ChairDecorator {
    private final IWheels wheels;

    public WheelsChairDecorator(IChair chair, IWheels wheels) {
        super(chair);
        this.wheels = wheels;
        addWeight(6);
    }

    @Override
    public boolean sitOn(ISitter sitter) {
        return super.chair.sitOn(sitter);
    }

    @Override
    public void move(Direction direction, int distance) {
        wheels.ride(distance);
        super.chair.move(direction, distance);
    }

    @Override
    public boolean hasSitter() {
        return super.chair.hasSitter();
    }

    @Override
    public void addWeight(double weight) {
        super.addWeight(weight);
    }

    @Override
    public double getWeight() {
        return super.chair.getWeight();
    }
}
