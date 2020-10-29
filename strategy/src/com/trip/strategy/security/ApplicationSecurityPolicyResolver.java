package com.trip.strategy.security;

import com.trip.ApplicationType;

public class ApplicationSecurityPolicyResolver implements IApplicationSecurityPolicyResolver {
    public ISecurityPolicy resolveSecurityPolicy(ApplicationType applicationType) {
        return switch(applicationType) {
            case PRESENTATIONAL -> new PresentationalSecurityPolicy();
            case COMMERCIAL -> new CommercialSecurityPolicy();
            default -> throw new IllegalArgumentException("invalid application type");
        };
    }
}
