package dev.kaps;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];/*Declaring your arrays with a specific type allows compile-time type checking, as you can see here. Type checking at compile-time prevents runtime exceptions when instances assigned to arrays aren't what they are expected to be.*/
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("BMW", "Sports", 5);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Buttermilk"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();/*These angle brackets, when empty like this, are called the diamond operator.*/
        groceryList.add(new GroceryItem("Buttermilk"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
        groceryList.set(0, new GroceryItem("Apple","PRODUCE",6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
