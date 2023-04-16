import java.util.Scanner;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }else{
            System.out.println("*****");
            for(int i = 0;i < number;i++){
                for(int j = 1;j < number;j++){
                    System.out.print("");
                }
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);

    }
}
