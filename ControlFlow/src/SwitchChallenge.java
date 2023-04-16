import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char newChar = sc.next().charAt(0);
        switch(newChar){
            case 'A' -> System.out.println("A is a Able");
            case 'B' -> System.out.println("B is a Baker");
            case 'C' -> System.out.println("C is a Charlie");
            case 'D' -> System.out.println("D is a Dog");
            case 'E' -> System.out.println("E is a Easy");
            default -> System.out.println("Letter " + newChar + " the letter is not available ");
        }
    }
}
