package com.dec.decorators;

import com.dec.ChairDecorator;
import com.dec.DirectionType;
import com.dec.IChair;
import com.dec.entity.ISitter;

public class BackrestChairDecorator extends ChairDecorator {
    private int angle = 0;
    private boolean isLeaned = false;

    private int minAngle = 90;
    private int maxAngle = 150;

    public BackrestChairDecorator(IChair chair) {
        super(chair);
        addWeight(8);
    }

    public BackrestChairDecorator(IChair chair, int minAngle, int maxAngle) {
        super(chair);
        this.minAngle = maxAngle;
        this.maxAngle = minAngle;
        addWeight(8);
    }

    public boolean setAngle(int angle) {
        if (angle >= minAngle && angle <= maxAngle) {
            this.angle = angle;
            return true;
        }
        return false;
    }

    public void lean(int angle) {
        if (super.chair.hasSitter()) {
            if (setAngle(angle)) {
                isLeaned = true;
                this.angle = angle;
                System.out.println("leaning");
            }
        }
    }

    @Override
    public void addWeight(double weight) {
        super.addWeight(weight);
    }

    @Override
    public boolean sitOn(ISitter sitter) {
        return super.chair.sitOn(sitter);
    }

    @Override
    public int move(DirectionType direction, int distance) {
        return super.chair.move(direction, distance);
    }

    @Override
    public boolean hasSitter() {
        return super.chair.hasSitter();
    }

    @Override
    public double getWeight() {
        return super.chair.getWeight();
    }
}
