
public class Main {
    public static void main(String[] args) {
        Car car = new GasPoweredCar("lala", 12, 4);

        car.startEngine();
        car.drive();
        if (car instanceof GasPoweredCar gasCar) {
            gasCar.gasPoweredHi();
        }

        ElectricCar electricCar = new ElectricCar("asdasd", 100, 23);

        electricCar.drive();
        electricCar.startEngine();
        electricCar.printBatterySize();

        Car car2 = new Car("lallala");
        car2.drive();
        car2.drive();
    }

}