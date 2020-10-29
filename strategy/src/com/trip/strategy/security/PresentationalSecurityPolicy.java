package com.trip.strategy.security;

public class PresentationalSecurityPolicy implements ISecurityPolicy {
    @Override
    public void applySecurity() {
        System.out.println("apply presentational security");
    }
}
