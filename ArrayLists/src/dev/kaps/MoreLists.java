package dev.kaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
            System.out.println("List contains pickles");/*List contains pickles*/
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));/*first = 4*/
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));/*last = 8*/

        System.out.println(groceries);/*[apple, banana, milk, eggs, yogurt, pickles, mustard, cheese, yogurt]*/
        groceries.remove(1);
        System.out.println(groceries);/*[apple, milk, eggs, yogurt, pickles, mustard, cheese, yogurt]*/
        groceries.remove("yogurt");
        System.out.println(groceries);/*[apple, milk, eggs, pickles, mustard, cheese, yogurt]*/

        groceries.removeAll(List.of("apple", "eggs"));
        System.out.println(groceries);/*[milk, pickles, mustard, cheese, yogurt]*/

        groceries.retainAll(List.of("apple", "milk", "mustard", "cheese"));
        System.out.println(groceries);/*[milk, mustard, cheese]*/

        groceries.clear();
        System.out.println(groceries);/*[]*/
        System.out.println("isEmpty = " + groceries.isEmpty());/*isEmpty = true*/

        groceries.addAll(List.of("apple", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);/*[apple, milk, mustard, cheese, eggs, pickles, mustard, ham]*/
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);/*[apple, cheese, eggs, ham, milk, mustard, mustard, pickles]*/

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);/*[pickles, mustard, mustard, milk, ham, eggs, cheese, apple]*/

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));/*[pickles, mustard, mustard, milk, ham, eggs, cheese, apple]*/
    }
}
