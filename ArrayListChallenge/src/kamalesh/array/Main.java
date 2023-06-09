package kamalesh.array;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("add items [seperated by commas]");
        String[] items = scanner.nextLine().split(",");
  //      groceries.addAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("remove items [seperated by commas]");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);

        }
    }


    private static void printActions() {
        String textBlock = """
                Avaialabe action:
                                
                 0 - to shutdown
                 
                 1 - to add items to list (comma delimited list)
                 
                 2 - to remove any items (comma delimted list)
                 
                 Enter a number for which action you want to do:
                """;
        System.out.println(textBlock + " ");
    }
}
