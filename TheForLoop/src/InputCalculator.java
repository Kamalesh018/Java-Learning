import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int number = 0;
        System.out.println("enter the value");

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                if (number >= 0) {

                    sum += number;
                }
                avg = sum / number;

            } catch (InputMismatchException e) {
                System.out.println("Sum = " + sum);
                System.out.println("Avg = " + avg);
                break;
            }

        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
