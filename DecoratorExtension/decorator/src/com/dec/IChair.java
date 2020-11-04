package com.dec;

import com.dec.entity.ISitter;

public interface IChair {
    boolean sitOn(ISitter sitter);
    void move(Direction direction, int distance);
    boolean hasSitter();
    void addWeight(double weight);
    double getWeight();
}
