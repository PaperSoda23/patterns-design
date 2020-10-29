package com.trip.strategy.execution;

public class MediumLoadApplicationExecutionStrategy implements IApplicationExecutionStrategy {
    @Override
    public void executeApplication() {
        System.out.println("execute medium");
    }
}
