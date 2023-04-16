public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 blue ferrai 296 gts");
        runRace(car);

        Car ferrai = new GasPowerCar("2022 blue ferrai 296 gts" ,
                15.4,6);
        runRace(ferrai);

        Car tesle  = new ElectricCar("2022 red telsa model 3",
                568,75);
        runRace(tesle);

        Car audi = new HybridCar("2022 red audei model A4",555,
                5,10);
        runRace(audi);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();

    }
}