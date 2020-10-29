package com.trip.strategy.security;

public class CommercialSecurityPolicy implements ISecurityPolicy {
    @Override
    public void applySecurity() {
        System.out.println("apply commercial security");
    }
}
