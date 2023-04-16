import java.util.Scanner;

public class MInAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int count = 0;
        while (true){
            System.out.println("Enter a number, or any character to exit");
            String number = sc.nextLine();
            try{
                double newValue = Double.parseDouble(number);
                if(count == 0 || newValue < min){
                    min = newValue;
                }
                if(count == 0 || newValue > max){
                    max = newValue;
                }
                count++;
            }catch (NumberFormatException nfe){
                System.out.println("enter the correct format");
                break;
            }
        }
        if(count > 0){
            System.out.println("min = " + min + "max = " + max);
        }else{
            System.out.println("No value data were enterd");
        }

    }
}
