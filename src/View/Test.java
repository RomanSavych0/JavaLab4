package View;

import BuisnessLogic.Implementation.Logic;
import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Data.implementation.DataController;
import recource.GetFromFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        DataController data = new DataController();

        Random random = new Random();
        Car testLowLevel;

        for (int i = 0; i < 50; i++) {
            testLowLevel = new CarLowLevel(random.nextInt(300), random.nextDouble());
            data.add(testLowLevel);
            Car testMediumLevel = new CarMediumLevel(random.nextInt(300), random.nextDouble());
            data.add(testMediumLevel);
            Car testPremiumLevel = new CarPremiumLevel(random.nextInt(300), random.nextDouble());
            data.add(testPremiumLevel);
        }


        Logic logic = new Logic();
        System.out.println("Baggage Count : ");
        System.out.println(logic.getBaggageCount(data.getAllCars()));
        System.out.println("Before Sort:");
        System.out.println(data);
        System.out.println("--------------");

        //Test Sort
        System.out.println("After sort");
        logic.sortByComfortLevel(data.getAllCars());
        System.out.println("----------------------------------");
        for (Car o : data.getAllCars()
        ) {
            System.out.println(o);

        }
        System.out.println("--------------------");
        System.out.println("Testing Cars by Diapazon");
        System.out.println("--------------------");

        List<Car> carByDiapazon = new ArrayList<Car>();
        carByDiapazon = logic.getCarByPassengerNumber(data.getAllCars(), 10, 100);

        for (Car obj : carByDiapazon
        ) {
            System.out.println(obj);
        }


    }
}
