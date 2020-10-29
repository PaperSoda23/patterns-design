package com.trip.template;

import com.trip.Application;

public class MediumLoadCommercialApplication extends Application {
    @Override
    protected void enableAttackWatcher() {
        super.enableAttackWatcher();
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
    protected void optimizeAssets() {
        super.optimizeAssets();
        System.out.println("custom");
    }
}
