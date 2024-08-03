package dev.kaps;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apple", "banana", "milk", "eggs"};

        List<String> list = List.of(items);/*immutable list*/
        System.out.println(list);/*[apple, banana, milk, eggs]*/

        ArrayList<String> groceries = new ArrayList<>(list);/*new mutable array list, populated with the elements from the immutable list*/
        groceries.add("yogurt");
        System.out.println(groceries);/*[apple, banana, milk, eggs, yogurt]*/

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles","mustard","cheese"));/*In this code, I create a new array list, and this time, I can just pass a list of strings to the static method on list, called list dot of, and I put that in my constructor parentheses as shown. This is one way to create and populate a small array list in one statement, with a few known elements.*/
        System.out.println(nextList);/*[pickles, mustard, cheese]*/

        groceries.addAll(nextList);
        System.out.println(groceries);/*[apple, banana, milk, eggs, yogurt, pickles, mustard, cheese]*/

        System.out.println(list.getClass().getName());/*java.util.ImmutableCollections$ListN*/

        System.out.println("Third item = " + groceries.get(2));/*Third item = milk*/

        if (groceries.contains("pickles")) {
            System.out.println("List contains pickles");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("pickles","mustard","cheese"));
        System.out.println(groceries);


    }
}
