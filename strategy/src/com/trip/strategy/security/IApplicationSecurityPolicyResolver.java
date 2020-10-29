package com.trip.strategy.security;

import com.trip.ApplicationType;

public interface IApplicationSecurityPolicyResolver  {
    ISecurityPolicy resolveSecurityPolicy(ApplicationType applicationType);
}
