package dev.Kaps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[0] = 5;
        modifyArray(myIntArray);
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
    }

    public static void modifyArray(int[] array) {

        array[1]=2;
    }
}
