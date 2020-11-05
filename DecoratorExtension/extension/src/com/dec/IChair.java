package com.dec;

import com.dec.entity.ISitter;

public interface IChair {
    boolean sitOn(ISitter sitter);
    int move(DirectionType directionType, int distance);
}
