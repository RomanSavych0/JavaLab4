package Data.CarClases;

import Data.CarClases.Car;

public class CarPremiumLevel extends Car {
    public CarPremiumLevel(int passengerNumber, double baggageNumber) {
        super(passengerNumber, baggageNumber);
        this.comfortLevel = 100;
    }
}
