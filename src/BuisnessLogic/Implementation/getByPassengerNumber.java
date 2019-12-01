package BuisnessLogic.Implementation;

import BuisnessLogic.Interfaces.Command;
import Data.CarClases.Car;

import java.util.List;

public class getByPassengerNumber  implements Command {

    List<Car> data;
    Logic logic = new Logic();

    public getByPassengerNumber(List<Car> data) {
        this.data = data;
    }


    @Override
    public void execute() {
        System.out.println("To do later");
    }
}
