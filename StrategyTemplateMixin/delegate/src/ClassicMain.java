import classic.Bear;
import classic.Seagull;
import classic.behavior.Fly;
import classic.behavior.Run;
import classic.behavior.Swim;

public class ClassicMain {
    public static void main(String[] args) {
        var run = new Run();
        var swim = new Swim();
        var fly = new Fly();

        var bear = new Bear(run, swim);
        var gull = new Seagull(fly, swim);

        bear.swim(20);
        bear.run(40);
        gull.fly(20);
        gull.swim(30);
    }
}
