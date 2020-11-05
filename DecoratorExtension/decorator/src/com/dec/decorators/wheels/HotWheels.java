package com.dec.decorators.wheels;

public class HotWheels implements IWheels {
    @Override
    public int ride(int time) {
        System.out.println("riding hot at: ");
        return (int)(0.2 * time);
    }
}
