package kamalesh.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"kamalesh", "jp", "kavin"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"bala");
        System.out.println("lists : " + originalList);
        System.out.println("array : " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array : " + Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("sundday","monday","tuesday");
        System.out.println(newList);
    }
}
