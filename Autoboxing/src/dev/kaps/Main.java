package dev.kaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); //preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive(); //The method getLiteralDoublePrimitive returns a primitive data type, but the JVM is automatically boxing it, because it's being assigned to a  variable, of the java.lang.Double class. And the same is true in reverse.
        double resultUnboxed = getDoubleObject();// The method getDoubleObject returns an object instance, but because we're assigning it directly to a primitive variable, the unboxing occurs automatically.

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));//[50, null, null, null, null]
        System.out.println(wrapperArray[0].getClass().getName());//java.lang.Integer

        //This is an example of using an array initializer, using char literals, and the JVM auto boxes each of those values into the array.
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));//[a, b, c, d]

        var ourList = List.of(1,2,3,4,5);
        System.out.println(ourList);//[1, 2, 3, 4, 5]
    }

    private static ArrayList<Integer> getList(Integer... varargs) {

        ArrayList<Integer> alist = new ArrayList<>();//You can't put just the int type in there, so this is a good place for auto boxing.
        for (int var : varargs) {
            alist.add(var);//The add method on an ArrayList is declared with an Integer wrapper parameter type, not a primitive type. This is another way to auto box.
        }
        return alist;
    }//This method is declared with a single parameter, a variable arguments declaration, for the int primitive. This means this method can be called with 0 to many int values.

    private static int returnAnInt(Integer i) {
        return i;
    }//Java unboxes the i argument, to return the primitive value boxed in the wrapper argument, as the return value from this method.

    private static Integer returnAnInteger(int i) {
        return i;
    }//This method takes an int parameter, and returns it from a method, that's got a declared return type of java.lang.Integer. An object is returned

    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}
