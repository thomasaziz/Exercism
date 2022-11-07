import java.rmi.Remote;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private final int SPEED = 10;

    private int distanceTravelled;
    private int numberOfVictories;

    @Override
    public void drive() {
        this.distanceTravelled += SPEED;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar that) {
        return Integer.compare(this.getNumberOfVictories(), that.getNumberOfVictories());
    }

}
