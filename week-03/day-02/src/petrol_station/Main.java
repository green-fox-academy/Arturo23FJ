package petrol_station;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Petrol station's gasamount at the beginning: " + Station.gasAmount);
        System.out.println("Car's gasamount before refilling: " + car.gasAmount);
        Station.refillCar(car);
        System.out.println("Petrol station's gasamount after refilling: " + Station.gasAmount);
        System.out.println("Car's gasamount after refilling: " + car.gasAmount);
    }
}
