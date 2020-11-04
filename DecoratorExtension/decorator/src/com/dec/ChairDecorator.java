package com.dec;

public abstract class ChairDecorator implements IChair {
    protected IChair chair;

    public ChairDecorator(IChair chair) {
        this.chair = chair;
    }

    public void addWeight(double weight) {
        chair.addWeight(weight);
    }
}
