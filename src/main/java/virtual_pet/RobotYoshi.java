package virtual_pet;

public class RobotYoshi extends Yoshi {
    public boolean robot;
    public int rageCounter;

    public RobotYoshi(String name, int hunger, int boredom, int thirst, String color, int rageCounter, boolean robot) {
        super(name, hunger, boredom, thirst, color);
    }

    public boolean isRobot() {
        return robot;
    }

    public int getRageCounter() {
        return rageCounter;
    }

}



