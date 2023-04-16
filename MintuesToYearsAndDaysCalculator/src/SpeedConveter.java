public class SpeedConveter {
    public static double toMilesPerHour(double kilometersPerhour){
        if(kilometersPerhour < 0.00d){
            return -1;
        }else return Math.round(kilometersPerhour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0.00d){
            System.out.println("Invalid Value");
        }
        System.out.println(kilometersPerHour + "km/h="+ SpeedConveter.toMilesPerHour(kilometersPerHour) + "mi/h");
    }

    public static void main(String[] args) {
        SpeedConveter.printConversion(1.5);
        SpeedConveter.printConversion(10.25);
        SpeedConveter.printConversion(-5.6);
        SpeedConveter.printConversion(25.42);
        SpeedConveter.printConversion(75.114);
    }
}
