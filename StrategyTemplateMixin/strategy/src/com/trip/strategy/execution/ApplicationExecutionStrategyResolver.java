package com.trip.strategy.execution;

import com.trip.ApplicationLoad;

public class ApplicationExecutionStrategyResolver implements IApplicationExecutionStrategyResolver {
    @Override
    public IApplicationExecutionStrategy resolveApplicationExecutionStrategy(ApplicationLoad applicationLoad) {
        return switch (applicationLoad) {
            case HIGH -> new HighLoadApplicationExecutionStrategy();
            case MEDIUM -> new MediumLoadApplicationExecutionStrategy();
            case LOW -> null;
            default -> throw new IllegalArgumentException("no such case in appload enum" + applicationLoad);
        };
    }
}
