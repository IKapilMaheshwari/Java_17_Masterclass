package dev.kaps;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);/*This method doesn't return anything, it's return type is void,*/
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);/*it sets every element to five.*/
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane", "Mary", "Ralph", "Bob"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mary") >= 0) {
            System.out.println("Found Mary in the list");
        }

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {5,2,3,4,1};
        if (Arrays.equals(a1, a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
    private static int[] getRandomArray(int length) {

        Random random = new Random();
        int[] newInt = new int[length];
        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
