package com.trip;

import com.trip.entity.Connection;
import com.trip.entity.User;
import com.trip.strategy.execution.DefaultApplicationExecutionStrategy;
import com.trip.strategy.execution.IApplicationExecutionStrategy;
import com.trip.strategy.security.IApplicationSecurityPolicyResolver;
import com.trip.strategy.execution.IApplicationExecutionStrategyResolver;
import com.trip.service.IApplicationLoadEvaluator;

import java.util.List;

public class Application {
    private final List<User> users;
    private final Connection connection;

    private final IApplicationLoadEvaluator applicationLoadEvaluator;
    private final IApplicationExecutionStrategyResolver applicationExecutionStrategyResolver;
    private final IApplicationSecurityPolicyResolver applicationSecurityPolicyResolver;

    private IApplicationExecutionStrategy applicationExecutionStrategy;
    private ApplicationType applicationType;

    public Application(
            List<User> users,
            Connection connection,
            IApplicationLoadEvaluator applicationLoadEvaluator,
            IApplicationExecutionStrategyResolver applicationExecutionStrategyResolver,
            ApplicationType applicationType,
            IApplicationSecurityPolicyResolver applicationSecurityPolicyResolver
    ) {
        this.users = users;
        this.connection = connection;
        this.applicationLoadEvaluator = applicationLoadEvaluator;
        this.applicationExecutionStrategyResolver = applicationExecutionStrategyResolver;
        this.applicationSecurityPolicyResolver = applicationSecurityPolicyResolver;
        this.applicationExecutionStrategy = new DefaultApplicationExecutionStrategy();
        this.applicationType = applicationType;
    }

    public void setApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
    }

    public void setApplicationExecutionStrategy(IApplicationExecutionStrategy applicationExecutionStrategy) {
        this.applicationExecutionStrategy = applicationExecutionStrategy;
    }

    public void start() {
        var appLoad = applicationLoadEvaluator
                .evaluateApplicationLoad(users.size(), connection.getBandwidth());
        var appExecStrategy = applicationExecutionStrategyResolver
                .resolveApplicationExecutionStrategy(appLoad);

        var applicationSecurityPolicy = applicationSecurityPolicyResolver
                .resolveSecurityPolicy(applicationType);
        if (appExecStrategy != null) setApplicationExecutionStrategy(appExecStrategy);

        applicationSecurityPolicy.applySecurity();
        applicationExecutionStrategy.executeApplication();
    }
}
