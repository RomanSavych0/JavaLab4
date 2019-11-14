package Data.implementation;

import Data.CarClases.Car;
import Data.Interfaces.IData;

import java.util.ArrayList;
import java.util.List;

public class DataController implements IData {
private List<Car>Cars;

    public DataController() {
        List<Car>cars = new ArrayList<Car>();
        Cars = cars;
    }
    public  DataController(List<Car>cars)
    {
        Cars = cars;
    }

    @Override
    public String toString() {
        return "DataController{" +
                "Cars=" + Cars +
                '}';
    }

    @Override
    public List<Car> getAllCars() {
        return Cars;
    }

        public  void add(Car object)
        {
            Cars.add(object);
        }



}
