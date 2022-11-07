public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private final int SPEED = 20;

    private int distanceTravelled;

    public void drive() {
        this.distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
