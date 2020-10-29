package com.trip.strategy.execution;

public class DefaultApplicationExecutionStrategy implements IApplicationExecutionStrategy {
    @Override
    public void executeApplication() {
        System.out.println("execute default");
    }
}
