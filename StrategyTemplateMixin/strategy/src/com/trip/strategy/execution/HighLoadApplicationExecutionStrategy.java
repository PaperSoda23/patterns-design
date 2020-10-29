package com.trip.strategy.execution;

public class HighLoadApplicationExecutionStrategy implements IApplicationExecutionStrategy {

    @Override
    public void executeApplication() {
        System.out.println("execute high");
    }
}
