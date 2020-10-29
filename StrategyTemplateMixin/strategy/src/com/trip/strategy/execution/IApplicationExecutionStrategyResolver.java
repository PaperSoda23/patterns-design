package com.trip.strategy.execution;

import com.trip.ApplicationLoad;

public interface IApplicationExecutionStrategyResolver {
    IApplicationExecutionStrategy resolveApplicationExecutionStrategy(ApplicationLoad applicationLoad);
}
