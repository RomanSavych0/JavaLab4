package Logic.Implementation;

import Logic.Interfaces.Command;
import Data.CarClases.Car;

import java.util.List;

public class sortByComfortLevel implements Command {
    List<Car> data;
    Logic logic = new Logic();

    public sortByComfortLevel(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        logic.sortByComfortLevel(data);
    }
}
