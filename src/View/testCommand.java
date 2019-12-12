package View;

import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Data.implementation.DataController;
import recource.GetFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class testCommand {

    private static final Logger LOGGER = Logger.getLogger(testCommand.class.getSimpleName());

    public static void main(String[] args) throws IOException {
        Scanner sc;
     FileHandler hendler = null;

        List<Car> list = new ArrayList<>();
        System.out.println("Create Vagons    0  - exit");
        System.out.println("Create Low-Level Vagon - 1");
        System.out.println("Create Medium-Level Vagon - 2");
        System.out.println("Create Premium-Level Vagon - 3");
        System.out.println("Read  Info From File  - 4");

        while (true) {
            sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count");
                double bagadgeCount = sc.nextDouble();

                Car carLowlevel = new CarLowLevel(passengerNumber, bagadgeCount);
                list.add(carLowlevel);

                LOGGER.info("Low Level Vagon was Created");

                //Logger
            }

            if (choice == 2) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count ");
                double bagadgeCount = sc.nextDouble();

                Car carMediumlevel = new CarMediumLevel(passengerNumber, bagadgeCount);
                list.add(carMediumlevel);

                //Logger
                LOGGER.info("Medium Level Vagon was Created");


            }

            if (choice == 3) {
                System.out.println("Input Passenger Number");
                int passengerNumber = sc.nextInt();
                System.out.println("Input Bagadge  Count");
                double bagadgeCount = sc.nextDouble();

                Car carLowlevel = new CarPremiumLevel(passengerNumber, bagadgeCount);
                list.add(carLowlevel);

                //Logger
                LOGGER.info("Premium Level Vagon was Created");

            }
            if (choice == 4) {

                GetFromFile frofile = new GetFromFile();
                DataController data2 = frofile.getInfoFromFile();


            }
            if (choice == 0) {
                break;
            }


        }

        DataController data = new DataController(list);

        System.out.println("get passenger number - 1 ");
        System.out.println("get bagadge  count  - 2 ");
        System.out.println("sort by Comfort level   - 3 ");
        System.out.println("print All Vagons   - 4 ");
        System.out.println("Get Vagons by passenger number -5");
        System.out.println("exit   - 0 ");

        while (true) {
            sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1)
                data.getPassengerNumber();

            if (choice == 2)
                data.getBagageCount();
            if (choice == 3)
                data.sortByComfortLevel();

            if (choice == 4)
                data.printAllvagons();

            if (choice == 5) {
                System.out.println("Input range ");
                System.out.println("Input min value :");
                int min = sc.nextInt();
                System.out.println("Input max value :");
                int max = sc.nextInt();
                data.setGetByPassengerNumber(min, max);

            }
            if (choice == 0)
                break;
        }


    }


}
