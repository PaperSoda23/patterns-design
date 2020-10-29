package com.trip.service;

import com.trip.ApplicationLoad;

public class ApplicationLoadEvaluator implements IApplicationLoadEvaluator {
    @Override
    public ApplicationLoad evaluateApplicationLoad(int userCount, int connectionBandwidth) {
        if (userCount >= 3 || connectionBandwidth > 500) return ApplicationLoad.HIGH;
        if (userCount >= 2 || connectionBandwidth > 400) return ApplicationLoad.MEDIUM;

        return ApplicationLoad.LOW;
    }
}
