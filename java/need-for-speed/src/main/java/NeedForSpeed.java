import javax.swing.text.DefaultStyledDocument.ElementSpec;

class NeedForSpeed {
    private int batteryLevel;
    private int speed;
    private int drainRate;
    private int distanceDriven;

    public NeedForSpeed(int speed, int drainRate){
        this.batteryLevel = 100;
        this.speed = speed;
        this.drainRate = drainRate;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        if (this.batteryLevel <= 0){
            return true;
        }

        return false;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!(batteryDrained())){
            this.distanceDriven += speed;
            this.batteryLevel -= drainRate;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        do {
            car.drive();

            if (car.distanceDriven() >= this.distance){
                return true;
            }
            } while(car.batteryDrained() != true);

            return false;
    }
}
