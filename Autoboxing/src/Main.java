import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Integer boxInt = Integer.valueOf(15);   // preferred but unnecessary
         Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
         int unboxedInt = boxInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
       // System.out.println(autoUnboxed.getClass().getName());
        Double resultUnboxing = getLiteralDoublePrimitive();
        Double resultUnboxed = getDoubleObject();

        Integer[] wrappedArray = new Integer[5];
        wrappedArray[0] = 50;
        System.out.println(Arrays.toString(wrappedArray));

        System.out.println(wrappedArray[0].getClass().getName());

        Character[] charArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(charArray));

        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;

    }

    public static int returnAnInt(Integer i) {
        return i;
    }
    public static Integer returnAnInt(int i) {
        return i;
    }
    public static Double getDoubleObject() {
        return Double.valueOf(100.0);
    }
    public static double getLiteralDoublePrimitive() {
        return 100.00;
    }
}