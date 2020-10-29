package com.trip.service;

import com.trip.ApplicationLoad;

public interface IApplicationLoadEvaluator {
    ApplicationLoad evaluateApplicationLoad(int userCount, int connectionBandwidth);
}
