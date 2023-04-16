package kamalesh.array;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>()
          var placesToVisit = new LinkedList<String>();

          placesToVisit.add("kamalesh");
          placesToVisit.add(0,"bala");
          System.out.println(placesToVisit);

          addMoreElements(placesToVisit);
          System.out.println(placesToVisit);

//          removeElements(placesToVisit);
//          System.out.println(placesToVisit);

      //  gettingElement(placesToVisit);
//        printItineray(placesToVisit);
//        System.out.println();
//        printItineray2(placesToVisit);
//        System.out.println();
//        printItineray3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> lists) {
        lists.addFirst("kavin");
        lists.addLast("momo");
        //Queue methods
        lists.offer("balasubramani");
        lists.offerFirst("kala");
        lists.offerLast("hethis");
        //Stack methods
        lists.push("mukesh");
    }

    private static void removeElements(LinkedList<String> lists) {
        lists.remove(5);
        lists.remove("hethis");
        String s1 = lists.remove();         // remove first elements
        System.out.println(s1 + " was removed");

        String s2 = lists.removeFirst();         // remove first elements
        System.out.println(s2 + " was removed");

        String s3 = lists.removeLast();         // remove last elements
        System.out.println(s3 + " was removed");
        // Queue/Dequeue poll methods
        String p1 = lists.poll(); //remove first element
        System.out.println(p1 + " was removed");

        String p2 = lists.pollFirst(); //remove first element
        System.out.println(p2 + " was removed");

        String p3 = lists.pollLast(); //remove last element
        System.out.println(p3 + " was removed");

        lists.push("kamalesh");
        lists.push("kavin");
        lists.push("bala");
        System.out.println(lists);

        String p4 = lists.pop();
        System.out.println(p4 + " was removed");
    }
    private static void gettingElement(LinkedList<String> lists) {
        System.out.println("retrived list: " + lists.get(4));

        System.out.println("first element: " + lists.getFirst());
        System.out.println("last element: " + lists.getLast());

        System.out.println("kamalesh at a position: " + lists.indexOf("kamalesh"));
        System.out.println("hethis at a position: " + lists.lastIndexOf("hethis"));
//      Queue retriving method
        System.out.println("elements in elements(): " + lists.element());
        // Stack retriving method
        System.out.println("element from element(): " + lists.peek());
        System.out.println("element from element(): " + lists.peekLast());
        System.out.println("element from element(): " + lists.peekFirst());
    }

    public static void printItineray(LinkedList<String> lists) {
        System.out.println("Trip starts at " + lists.getFirst());
        for(int i = 1; i < lists.size();i++){
            System.out.println("--> From: " + lists.get(i - 1) + " to " + lists.get(i));
        }
        System.out.println("Trip end at " + lists.getLast());
    }

    public static void printItineray2(LinkedList<String> lists) {
        System.out.println("Trip starts at " + lists.getFirst());
        String previousTown = lists.getFirst();
        for(String town : lists) {
            System.out.println("--> from: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip end at " + lists.getLast());
    }

    public static void printItineray3(LinkedList<String> lists) {
        System.out.println("Trip starts at " + lists.getFirst());
        String previousTown = lists.getFirst();
        ListIterator<String> iterator = lists.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> from: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip end at " + lists.getLast());
    }

    private static void testIterator(LinkedList<String> lists) {
        var iterator = lists.listIterator();
        while (iterator.hasNext()) {
          //  System.out.println(iterator.next());
            if(iterator.next().equals("momo")) {
                iterator.add("hari");         // we dont able to do lists.remove() methods exception throws
            }
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(lists);

        var iterator2 = lists.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
