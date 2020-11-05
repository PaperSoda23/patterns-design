package com.dec;

import com.dec.decorators.IWeightable;
import com.dec.entity.ISitter;

public interface IChair extends IWeightable {
    boolean sitOn(ISitter sitter);
    int move(DirectionType direction, int distance);
    boolean hasSitter();
}
