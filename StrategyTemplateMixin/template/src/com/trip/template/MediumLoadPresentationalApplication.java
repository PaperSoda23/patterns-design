package com.trip.template;

import com.trip.Application;

public class MediumLoadPresentationalApplication extends Application {
    @Override
    protected void enableAttackWatcher() {
        super.enableAttackWatcher();
        System.out.println("custom");
    }

    @Override
    protected void performSecurityScan() {
        super.performSecurityScan();
        System.out.println("custom");
    }

    @Override
    protected void optimizeAssets() {
        super.optimizeAssets();
        System.out.println("custom");
    }
}
