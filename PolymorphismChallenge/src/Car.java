public class Car {
    public String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("car -> runEngine");
    }
}


class GasPowerCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPowerCar(String description) {
        super(description);
    }

    public GasPowerCar(String description, double avgKmPerLiter,int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("gas -> all %d cylinders are fired up , ready!%n ", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("gas -> usage exceeds the avarage: %.2f %n" , avgKmPerLiter);
    }


}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter,int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> swtich %d kWh battery on, ready!%n " , batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage the average: %2f %n",avgKmPerCharge);
    }


}

class HybridCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders = 6;



    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter,int batterySize,
                     int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;

    }

    @Override
    public void startEngine() {
        System.out.printf("hybrid -> %d cylinders are fired up. %n", cylinders);
        System.out.printf("hybrid -> switch %d kWh battery on, ready !%n", batterySize);
    }

    @Override
    protected void runEngine() {

        System.out.printf("hybrid -> usage below the average: %2f %n",avgKmPerCharge);
    }


}

