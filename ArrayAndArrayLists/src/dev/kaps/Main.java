package dev.kaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);/*list: [one, Second, Third]*/
        System.out.println("array: " + Arrays.toString(originalArray));/*array: [one, Second, Third]*/

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));/*array: [Second, Third, one]*/

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);/*[Sunday, Monday, Tuesday]*/
    }
}
