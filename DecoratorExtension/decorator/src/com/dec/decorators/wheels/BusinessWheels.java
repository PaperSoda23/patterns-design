package com.dec.decorators.wheels;

public class BusinessWheels implements IWheels {

    @Override
    public int ride(int time) {
        System.out.println("riding business ");
        return (int)(0.6 * time);
    }
}
