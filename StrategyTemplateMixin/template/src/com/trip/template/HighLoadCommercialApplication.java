package com.trip.template;

import com.trip.Application;

public class HighLoadCommercialApplication extends Application {
    @Override
    protected void enableAttackWatcher() {
        super.enableAttackWatcher();
        System.out.println("custom");
    }

    @Override
    protected void setupFirewall() {
        super.setupFirewall();
        System.out.println("custom");
    }

    @Override
    protected void performSecurityScan() {
        super.performSecurityScan();
        System.out.println("custom");
    }

    @Override
    protected void encryptCommunication() {
        super.encryptCommunication();
        System.out.println("custom");
    }

    @Override
    protected void useLoadBalancer() {
        super.useLoadBalancer();
        System.out.println("custom");
    }

    @Override
    protected void optimizeAssets() {
        super.optimizeAssets();
        System.out.println("custom");
    }
}
