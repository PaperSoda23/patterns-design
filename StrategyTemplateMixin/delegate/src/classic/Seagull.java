package classic;

import classic.behavior.Fly;
import classic.behavior.Swim;

public class Seagull extends LivingCreature implements IFlyer, ISwimmer {
    private final Fly fly;
    private final Swim swim;

    public Seagull(Fly fly, Swim swim) {
        this.fly = fly;
        this.swim = swim;
    }

    @Override
    public void fly(int speed) {
        fly.fly(speed);
    }

    @Override
    public void swim(int speed) {
        swim.swim(speed);
    }
}
