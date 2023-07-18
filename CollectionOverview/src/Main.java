import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String[] names = {"kamalesh" , "dinesh" , "bala" , "hirthick"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("jp");
        list.addAll(Arrays.asList("kavin" , "momo" , "hari"));
        System.out.println(list);
        System.out.println("jp is the list? " + list.contains("jp"));
    }
}