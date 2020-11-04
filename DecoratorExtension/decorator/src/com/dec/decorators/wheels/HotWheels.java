package com.dec.decorators.wheels;

public class HotWheels implements IWheels {
    @Override
    public void ride(int distance) {
        System.out.println("riding hot at: " + distance);
    }
}
