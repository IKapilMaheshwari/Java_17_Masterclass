package dev.kaps;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();//we can use the var keyword for typed LinkedLists (or any typed list or collection). But when we do, we have to specify the type parameter, on the right side of the assignment operator, in the angle brackets.
        //Adding records to a LinkedList, is a lot like adding records to an ArrayList
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"New York");//the overloaded method for add
        System.out.println(placesToVisit); //[New York, Sydney]

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);//[Alice Springs, Brisbane, Darwin, New York, Sydney, Hobart, Melbourne, Toowoomba]

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);//[Brisbane, New York, Sydney, Melbourne, Toowoomba]

//        gettingElements(placesToVisit);

//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");//queue language for adding an element to the end of the queue.
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);//removes forth element
        list.remove("Brisbane");//removes "Brisbane"

        System.out.println(list);//[Alice Springs, Darwin, New York, Hobart, Melbourne, Toowoomba]
        String s1 = list.remove();//removes first element
        System.out.println(s1 + " was removed");//Alice Springs was removed

        String s2 = list.removeFirst();//removes first element
        System.out.println(s2 + " was removed");//Darwin was removed

        String s3 = list.removeLast();//removes last element
        System.out.println(s3 + " was removed");//Toowoomba was removed

        //Queue/Deque poll methods
        String p1 = list.poll();//removes first element
        System.out.println(p1 + " was removed");//New York was removed
        String p2 = list.pollFirst();//removes first element
        System.out.println(p2 + " was removed");//Hobart was removed
        String p3 = list.pollLast();//removes last element
        System.out.println(p3 + " was removed");//Melbourne was removed

        list.push("Sydney");
        list.push("New York");
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        list.push("Alice Springs");
        System.out.println(list);//[Alice Springs, Brisbane, New York, Sydney, Melbourne, Toowoomba]
        String p4 = list.pop();//removes first element
        System.out.println(p4 + " was removed");//Alice Springs was removed
    }

    private static void gettingElements(LinkedList<String> list) {

        System.out.println("Retrieved Element: " + list.get(4));//Retrieved Element: Sydney
        System.out.println("First Element: " + list.getFirst());//First Element: Alice Springs
        System.out.println("Last Element: " + list.getLast());//Last Element: Toowoomba

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));//Darwin is at position: 2
        System.out.println("Melbourne is at position: " + list.indexOf("Melbourne"));//Melbourne is at position: 6
        //Queue retrieval method
        System.out.println("Element from element(): " + list.element());//Element from element(): Alice Springs
        //Stack retrieval methods
        System.out.println("Element from peek(): " + list.peek());//Element from peek(): Alice Springs
        System.out.println("Element from peekFirst(): " + list.peekFirst());//Element from peekFirst(): Alice Springs
        System.out.println("Element from peekLast(): " + list.peekLast());//Element from peekLast(): Toowoomba
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());//Trip starts at Alice Springs
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i-1) + " to: " + list.get(i));
        }
        /*--> From: Alice Springs to: Brisbane
        --> From: Brisbane to: Darwin
        --> From: Darwin to: New York
        --> From: New York to: Sydney
        --> From: Sydney to: Hobart
        --> From: Hobart to: Melbourne
        --> From: Melbourne to: Toowoomba*/
        System.out.println("Trip ends at " + list.getLast());//Trip ends at Toowoomba
    }

    public static void printItinerary2(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());//Trip starts at Alice Springs
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to: " + town);
            previousTown = town;
        }
        /*--> From: Alice Springs to: Alice Springs
        --> From: Alice Springs to: Brisbane
        --> From: Brisbane to: Darwin
        --> From: Darwin to: New York
        --> From: New York to: Sydney
        --> From: Sydney to: Hobart
        --> From: Hobart to: Melbourne
        --> From: Melbourne to: Toowoomba*/
        System.out.println("Trip ends at " + list.getLast());//Trip ends at Toowoomba
    }

    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());//Trip starts at Alice Springs
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to: " + town);
            previousTown = town;
        }
        /*--> From: Alice Springs to: Brisbane
        --> From: Brisbane to: Darwin
        --> From: Darwin to: New York
        --> From: New York to: Sydney
        --> From: Sydney to: Hobart
        --> From: Hobart to: Melbourne
        --> From: Melbourne to: Toowoomba*/
        System.out.println("Trip ends at " + list.getLast());//Trip ends at Toowoomba
    }

    private static void testIterator(LinkedList<String> list) {

        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);//[Alice Springs, Darwin, New York, Sydney, Hobart, Melbourne, Toowoomba]

        var iterator2 = list.listIterator(3);//This is a way to obtain an iterator with the cursor positioned at some place other than the default.
        System.out.println(iterator2.next());
    }
}

