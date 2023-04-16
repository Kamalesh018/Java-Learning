import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BusFinder {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("Bus_data.txt");
             Scanner sc = new Scanner(System.in);
        ) {
            boolean cont;

            do {
                System.out.println("ID (String) : ");
                String id = sc.nextLine();
                System.out.println("Departure (String) : ");
                String departureLoc = sc.nextLine();
                System.out.println("Departure Time (String) : ");
                String departureTime = sc.nextLine();
                System.out.println("Reach (String) : ");
                String reachLoc = sc.nextLine();
                System.out.println("Reach Time (String) : ");
                String reachTime = sc.nextLine();
                System.out.println("Number of stops (Int) : ");
                int stopCount = sc.nextInt();
                sc.nextLine();
                HashMap<String, Double> stopList = new HashMap<>();
                for (int i = 0; i < stopCount; i++) {
                    System.out.println("Enter stop " + (i + 1) + " name (String) : ");
                    String stopName = sc.nextLine();
                    System.out.println("Enter stop " + (i + 1) + " cost (String) : ");
                    Double cost = sc.nextDouble();
                    sc.nextLine();
                    stopList.put(stopName, cost);
                }
                System.out.println("Is Ladies? (y/n) : ");
                boolean isLadies = sc.nextLine().equalsIgnoreCase("y");
                System.out.println("Do you want to continue? (y/n) : ");
                cont = sc.nextLine().equalsIgnoreCase("y");

                StringBuilder mapObj = new StringBuilder();
                mapObj.append("stopList = mapOf(");
                for (String e : stopList.keySet()) {
                    mapObj.append("\"" + e + "\" to " + stopList.get(e));
                    mapObj.append(",");
                }
                mapObj.append(")\n");

                StringBuilder busObj = new StringBuilder();
                busObj.append("bus = Bus(");
                busObj.append("\"" + id + "\"");
                busObj.append(",");
                busObj.append("\"" + departureLoc + "\"");
                busObj.append(",");
                busObj.append("\"" + departureTime + "\"");
                busObj.append(",");
                busObj.append("\"" + reachLoc + "\"");
                busObj.append(",");
                busObj.append("\"" + reachTime + "\"");
                busObj.append(",");
                busObj.append("stopList");
                busObj.append(",");
                busObj.append("null");
                busObj.append(",");
                busObj.append(isLadies);
                busObj.append(")\n");

                fileWriter.write(mapObj.toString());
                fileWriter.write(busObj.toString());
                fileWriter.write("busDB.child(bus.id!!).setValue(bus)\n");

            } while (cont);
            fileWriter.close();


        } catch (IOException | NullPointerException e) {
            System.out.println("---> Exception : " + e);
        }

    }
}
