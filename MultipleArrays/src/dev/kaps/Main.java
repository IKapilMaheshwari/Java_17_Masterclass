package dev.kaps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("Array2.length: " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i*10) + (j+1);
            }
//            System.out.println();
        }

        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {1, 2, 3};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a","b","c","d"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {
                {"a","b","c","d"},
                {"a","b","c"},
                {"a","b","c","d","e"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type:" + element.getClass().getSimpleName());
            System.out.println("Element toString(): " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
