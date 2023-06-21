import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {
            System.out.println("enter the number:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int f = 1;

            for(int i=1;i<=n;i++) {
                f=f*i;
            }
            System.out.println("The factorial is " +f);
        }
}
