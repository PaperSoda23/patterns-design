package classic.behavior;

import classic.IFlyer;

public class Fly implements IFlyer {
    @Override
    public void fly(int speed) {
        System.out.println("im flying at speed" + speed);
    }
}