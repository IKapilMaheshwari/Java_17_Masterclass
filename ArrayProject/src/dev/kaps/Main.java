package dev.kaps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[5] = 50;

        double[] myArray = new double[10];
        myArray[2] = 3.5;
        System.out.println(myArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int[] newArray;
//        newArray = new int[] {5,4,3,2,1};
        newArray = new int[5];
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really int array" );
        }

        Object[] objectArray  = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = newArray;
    }
}
