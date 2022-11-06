public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseRate = 221;
        if (speed >= 1 && speed <= 4){
            return speed * baseRate;
        }
        else if (speed >= 5 && speed <= 8){
            return speed * baseRate * .90;
        }
        else if (speed == 9){
            return speed * baseRate * .80;
        }
        else if (speed == 10){
            return speed * baseRate * .77;
        }
        else{
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
    }
}
