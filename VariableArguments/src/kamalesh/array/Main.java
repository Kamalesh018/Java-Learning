package kamalesh.array;

public class Main {
    public static void main(String... args) {
      String[] splitString = "Hi I am Kamalesh".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hi");

        System.out.println("_".repeat(20));
        printText("Hi i am kavin");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"kamalesh","kavin","vijay"};
        System.out.println(String.join(",",sArray));

    }

    private static void printText(String... textlist){
        for(String t : textlist){
            System.out.println(t);
        }
    }
}
