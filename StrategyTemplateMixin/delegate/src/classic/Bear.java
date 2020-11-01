package classic;

import classic.behavior.Run;
import classic.behavior.Swim;

public class Bear extends LivingCreature implements IRunner, ISwimmer {
    private final Run run;
    private final Swim swim;

    public Bear(Run run, Swim swim) {
        this.run = run;
        this.swim = swim;
    }

    @Override
    public void run(int speed) {
        run.run(speed);
    }

    @Override
    public void swim(int speed) {
        swim.swim(speed);
    }
}
