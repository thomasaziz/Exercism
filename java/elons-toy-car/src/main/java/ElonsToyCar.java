public class ElonsToyCar {
    private int batteryLevel;
    private int distanceDriven;

    public ElonsToyCar(){
        this.batteryLevel = 100;
        this.distanceDriven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryLevel == 0){
            return "Battery empty";
        }
        else{
            return "Battery at " + this.batteryLevel + "%";
        }
        
    }

    public void drive() {
        if (batteryLevel < 1){
            return;
        }

        this.batteryLevel--;
        this.distanceDriven += 20;
    }
}
