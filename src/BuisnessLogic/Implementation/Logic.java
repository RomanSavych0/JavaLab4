package BuisnessLogic.Implementation;

import BuisnessLogic.Interfaces.ILogic;
import Data.CarClases.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic implements ILogic {
    @Override
    public int getPassengerNumber(List<Car>cars){
        int passengerNumber = 0;
        for (Car o :cars
             ) {

            passengerNumber += o.getPassengerNumber();

        }

        return passengerNumber;
    }



    @Override
    public double getBaggageCount(List<Car>cars) {

        double baggadgeNumber = 0;
        for (int i = 0; i < cars.size(); i++) {
        baggadgeNumber += cars.get(i).getBaggageNumber();



        }
        return baggadgeNumber;


    }

    @Override
    public void sortByComfortLevel(List<Car> cars){
      Collections.sort(cars);
    }

    @Override
    public List<Car> getCarByPassengerNumber(List<Car> cars , int min , int max) {
        List<Car>byDiapazon = new ArrayList<Car>();
        for (Car elem : cars
             ) {
            if(elem.getPassengerNumber() > min && elem.getPassengerNumber() < max)
                byDiapazon.add(elem);
        }

        return byDiapazon;
    }


}
