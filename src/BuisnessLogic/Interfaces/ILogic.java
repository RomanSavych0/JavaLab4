package BuisnessLogic.Interfaces;

import Data.CarClases.Car;

import java.util.ArrayList;
import java.util.List;

public interface ILogic {

    int getPassengerNumber(List<Car>cars);
    double getBaggageCount(List<Car>cars);
    void sortByComfortLevel(List<Car>cars);
    List<Car> getCarByPassengerNumber(List<Car>cars , int min , int max);


}
