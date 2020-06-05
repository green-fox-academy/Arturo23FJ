package petrol_station;

public class Station {
    static int gasAmount = 1000;

    public static int getGasAmount() {
        return gasAmount;
    }

    public static void refillCar(Car car){
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
    }
}
