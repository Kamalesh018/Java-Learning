package dev.lpa;

import com.abc.first.Item;

public class Main {
    public static void main(String[] args) {
        com.abc.first.Item item = new com.abc.first.Item("burger");
        Item firstitem = new Item("burger");
        System.out.println(item);
        System.out.println(firstitem);
    }
}
