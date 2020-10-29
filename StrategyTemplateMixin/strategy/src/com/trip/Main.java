package com.trip;

import com.trip.entity.Connection;
import com.trip.entity.User;
import com.trip.strategy.security.ApplicationSecurityPolicyResolver;
import com.trip.strategy.execution.ApplicationExecutionStrategyResolver;
import com.trip.service.ApplicationLoadEvaluator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var connection = new Connection(377);
        var users = new ArrayList<User>();
        users.add(new User());
//        users.add(new User());
//        users.add(new User());

	    var application = new Application(
	            users,
                connection,
                new ApplicationLoadEvaluator(),
                new ApplicationExecutionStrategyResolver(),
                ApplicationType.PRESENTATIONAL,
                new ApplicationSecurityPolicyResolver()
        );

	    application.start();
    }
}
