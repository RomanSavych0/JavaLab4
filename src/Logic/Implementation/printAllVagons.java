package Logic.Implementation;

import Logic.Interfaces.Command;
import Data.CarClases.Car;

import java.util.List;

public class printAllVagons implements Command {
    List<Car> data;
    Logic logic = new Logic();


    public printAllVagons(List<Car> data) {
        this.data = data;
    }

    @Override
    public void execute() {
        logic.printAllVagons(data);
    }

}
