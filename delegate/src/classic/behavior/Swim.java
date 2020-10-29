package classic.behavior;

import classic.ISwimmer;

public class Swim implements ISwimmer {
    @Override
    public void swim(int speed) {
        System.out.println("swimming at speed" + speed);
    }
}
