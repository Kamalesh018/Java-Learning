package kamalesh.array;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d) ", name,distance);
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVist = new LinkedList<Place>();
        Place adalaide = new Place("Adelaide", 1374);
        addPlaces(placesToVist,adalaide);
        addPlaces(placesToVist,new Place("adelaide",1374));
        addPlaces(placesToVist,new Place("Brisbane",917));
        addPlaces(placesToVist,new Place("Perth",3923));
        addPlaces(placesToVist,new Place("Alice Springs",2771));
        addPlaces(placesToVist,new Place("Darwin",3972));
        addPlaces(placesToVist,new Place("Melbourne",877));

        placesToVist.addFirst(new Place("Sydney",0));
        System.out.println(placesToVist);

        var iterator = placesToVist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        while (!quitLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("orginating : " + iterator.next());
                forward=true;
            }
            if(!iterator.hasNext()){
                System.out.println("orginating : " + iterator.hasPrevious());
                forward=false;
            }
            System.out.println("enter value");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem) {

                case "F":
                    System.out.println("user wants to go forward");
                    if(!forward){            //reversing direction
                        forward=true;
                        if(iterator.hasNext()){     //adjust position forward
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("user wants to go backwards");
                    if(forward){            //reversing direction
                        forward=false;
                        if(iterator.hasPrevious()){     //adjust position forward
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVist);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void addPlaces(LinkedList<Place> list,Place place){
        if(list.contains(place)){
            System.out.println("found duplicate " + place);
            return;
        }

        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("found duplicate " + place);
                return;
            }
        }
        int matchIndex = 0;
        for (var listPlace : list){
            if(place.distance() < listPlace.distance()){
                list.add(matchIndex,place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Availabe actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
