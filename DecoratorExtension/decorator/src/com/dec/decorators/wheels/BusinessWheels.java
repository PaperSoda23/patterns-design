package com.dec.decorators.wheels;

public class BusinessWheels implements IWheels {

    @Override
    public void ride(int distance) {
        System.out.println("riding business " + distance);
    }
}
