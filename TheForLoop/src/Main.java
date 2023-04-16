public class Main {
    public static double calculateInterest(double amount, double intrestRate){
        return (amount * (intrestRate / 100));
    }
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10; i += 0.25) {
            double finalAmount = calculateInterest(100.0,i);
            System.out.println("$100.00 at " + i + "% interest = $ " + finalAmount);
        }
    }
}
