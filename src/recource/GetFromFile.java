package recource;

import Data.CarClases.Car;
import Data.CarClases.CarLowLevel;
import Data.CarClases.CarMediumLevel;
import Data.CarClases.CarPremiumLevel;
import Data.implementation.DataController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetFromFile {

//повертає обєкт типу дата контролер,потім можемо отримати ліст обєктів типу Car
    public DataController getInfoFromFile(String path) throws IOException {
        String str = "";
        String stringReadToList = "";
        List<String> stringList = new ArrayList<>();
        List<Car> carList = new ArrayList<>();
        try (FileReader reader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\javaLab4\\src\\recource\\Info.txt")) {

            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                //System.out.print((char)c);
                str += (char) c;
                if ((char) c == '\r') {
                    stringReadToList = str;
                    str = "";
                    stringList.add(stringReadToList);
                    stringReadToList = "";

                }

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (String currString : stringList) {
            String[] arr = new String[1];

            if (currString.contains("Low")) {
                currString = currString.replace("Low", "");
                currString = currString.trim();
                arr = currString.split(" ");
                int passengerNumber = Integer.parseInt(arr[0]);
                double bagadgeCount = Double.parseDouble(arr[1]);

                carList.add(new CarLowLevel(passengerNumber, bagadgeCount));
            }
            if (currString.contains("Medium")) {
                System.out.println(currString);

                currString = currString.replace("Medium", "");
                arr = currString.split(" ");
                int passengerNumber = Integer.parseInt(arr[0]);
                double bagadgeCount = Double.parseDouble(arr[1]);

                carList.add(new CarMediumLevel(passengerNumber, bagadgeCount));

            }
            if (currString.contains("Premium")) {
                System.out.println(currString);

                currString = currString.replace("Premium", "");
                arr = currString.split(" ");
                int passengerNumber = Integer.parseInt(arr[0]);
                double bagadgeCount = Double.parseDouble(arr[1]);

                carList.add(new CarPremiumLevel(passengerNumber, bagadgeCount));
            }

        }

        return new DataController(carList);
    }

}
