package classic.behavior;

import classic.IRunner;

public class Run implements IRunner {
    @Override
    public void run(int speed) {
        System.out.println("running at speed" + speed);
    }
}
