package Data.CarClases;

public abstract class Car implements Comparable<Car> {
    private int passengerNumber;
    private double baggageNumber;
    protected int comfortLevel;


    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerNumber=" + passengerNumber +
                ", baggageNumber=" + baggageNumber +
                ", comfortLevel=" + comfortLevel +
                '}';
    }

    public Car(int passengerNumber, double baggageNumber) {
        this.passengerNumber = passengerNumber;
        this.baggageNumber = baggageNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void setBaggageNumber(double baggageNumber) {
        this.baggageNumber = baggageNumber;
    }


    public int getComfortLevel() {
        return comfortLevel;
    }


    public double getBaggageNumber() {
        return baggageNumber;
    }


    public int getPassengerNumber() {
        return passengerNumber;
    }


    @Override
    public int compareTo(Car o) {
        return this.comfortLevel - o.getComfortLevel();
    }

}
