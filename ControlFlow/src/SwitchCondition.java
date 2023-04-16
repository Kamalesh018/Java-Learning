import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int switchValue = sc.nextInt();
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            default -> System.out.println("the value is more than 1 and 2");
        }
    }
}
// "yield" is a keyword for used only in the brackets.
// this keyword fn is also act like a return.
// in switch statement we cant use the brackets, suppose we use the brackets instead of return we use  yield.