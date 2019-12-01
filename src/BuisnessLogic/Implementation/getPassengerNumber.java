package BuisnessLogic.Implementation;

import BuisnessLogic.Interfaces.Command;
import Data.CarClases.Car;

import java.util.List;

public class getPassengerNumber implements Command {
    List<Car> data;
    Logic logic = new Logic();


    public getPassengerNumber(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        logic.getPassengerNumber(data);
        System.out.println( logic.getPassengerNumber(data));
    }
}
