import java.util.*;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> carRanks = new ArrayList<ProductionRemoteControlCar>();          
        
        carRanks.add(prc1);
        carRanks.add(prc2);
        Collections.sort(carRanks);

        return carRanks;
                                                                    
    }
}
