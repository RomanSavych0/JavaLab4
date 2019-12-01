package View;

import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Data.implementation.DataController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testCommand {


    public static void main(String[] args) {
Scanner sc;
        List<Car> list  = new ArrayList<>();
        System.out.println("Create Vagons    0  - exit");
        System.out.println("Create Low-Level Vagon - 1");
        System.out.println("Create Medium-Level Vagon - 2");
        System.out.println("Create Premium-Level Vagon - 3");

        while(true)
        {
               sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if(choice == 1 )
                {
                    System.out.println("Input Passenger Number");
                    int  passengerNumber  =  sc.nextInt();
                    System.out.println("Input Passenger Number");
                    double bagadgeCount = sc.nextDouble();

                    Car carLowlevel = new CarLowLevel(passengerNumber , bagadgeCount);
                    list.add(carLowlevel);

                    System.out.println("low Level Vagon was Created");
                    //Logger
                }

                if(choice == 2)
                {
                    System.out.println("Input Passenger Number");
                    int  passengerNumber  =  sc.nextInt();
                    System.out.println("Input Passenger Number");
                    double bagadgeCount = sc.nextDouble();

                    Car carMediumlevel = new CarMediumLevel(passengerNumber , bagadgeCount);
                    list.add(carMediumlevel);

                    System.out.println("Medium  Level Vagon was Created");
                    //Logger

                }

            if(choice == 3 )
            {
                System.out.println("Input Passenger Number");
                int  passengerNumber  =  sc.nextInt();
                System.out.println("Input Passenger Number");
                double bagadgeCount = sc.nextDouble();

                Car carLowlevel = new CarPremiumLevel(passengerNumber , bagadgeCount);
                list.add(carLowlevel);

                System.out.println("Premium Level Vagon was Created");
                //Logger
            }

            if(choice == 0 )
            {
                break;
            }



        }

        DataController data  = new DataController(list);

        System.out.println("get passenger number - 1 ");
        System.out.println("get bagadge  count  - 2 ");
        System.out.println("sort by Comfort level   - 3 ");
        System.out.println("print All Vagons   - 4 ");
        System.out.println("exit   - 0 ");

        while(true)
        {
            sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice == 1 )
                data.getPassengerNumber();

            if(choice == 2 )
                data.getBagageCount();
            if(choice == 3 )
                data.sortByComfortLevel();

            if(choice == 4)
                data.printAllvagons();

            if(choice == 0 )
                break;
        }








    }




}
