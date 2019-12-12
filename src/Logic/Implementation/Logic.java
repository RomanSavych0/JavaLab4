package Logic.Implementation;

import Logic.Interfaces.ILogic;
import Data.CarClases.Car;
import View.testCommand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Logic implements ILogic {
    private static final Logger LOGGER = Logger.getLogger(Logic.class.getSimpleName());

    @Override
    public int getPassengerNumber(List<Car> cars) {
        int passengerNumber = 0;
        for (Car o : cars
        ) {

            passengerNumber += o.getPassengerNumber();

        }

        return passengerNumber;
    }


    @Override
    public double getBaggageCount(List<Car> cars) {


        double baggadgeNumber = 0;
        for (int i = 0; i < cars.size(); i++) {
            baggadgeNumber += cars.get(i).getBaggageNumber();
        }

        return baggadgeNumber;


    }

    @Override
    public void sortByComfortLevel(List<Car> cars) {
        Collections.sort(cars);
    }

    @Override
    public List<Car> getCarByPassengerNumber(List<Car> cars, int min, int max) {
        List<Car> byDiapazon = new ArrayList<Car>();
        for (Car elem : cars
        ) {
            if (elem.getPassengerNumber() > min && elem.getPassengerNumber() < max)
                byDiapazon.add(elem);
        }

        return byDiapazon;
    }


    @Override
    public void printAllVagons(List<Car> cars) {

        if (cars.isEmpty())
            LOGGER.warning("List is empty");


        for (Car car : cars
        ) {
            System.out.println(car);
        }
    }


}
