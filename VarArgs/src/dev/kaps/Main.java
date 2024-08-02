package dev.kaps;

public class Main {

    public static void main(String... args) {
        System.out.println("Hello World Again");

        String[] splitString = "Hello World Again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World","Again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",",sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
