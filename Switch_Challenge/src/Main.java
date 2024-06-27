public class Main {
    public static void main(String[] args) {
        char charValue = '#';
        System.out.println(charValue + " is " +NATO(charValue));
    }
    public static String NATO(char alphabet){
        return switch (alphabet){
            case 'A' -> "Able";
            case 'B' -> "Bake";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            case 'F' -> "Fox";
            case 'G' -> "George";
            case 'H' -> "How";
            case 'I' -> "Item";
            case 'J' -> "Jig";
            case 'K' -> "King";
            case 'L' -> "Love";
            case 'M' -> "Mike";
            case 'N' -> "Nan";
            case 'O' -> "Oboe";
            case 'P' -> "Peter";
            case 'Q' -> "Queen";
            case 'R' -> "Roger";
            case 'S' -> "Sugar";
            case 'T' -> "Tare";
            case 'U' -> "Uncle";
            case 'V' -> "Victor";
            case 'W' -> "William";
            case 'X' -> "X-ray";
            case 'Y' -> "Yoke" ;
            case 'Z' -> "Zebra";
            default -> "bad";
        };
    }
//        switch(alphabet){
//            case 'A':
//                System.out.print( "Able");
//                break;
//            case 'B':
//                System.out.print( "Bake");
//                break;
//            case 'C':
//                System.out.print( "Charlie");
//                break;
//            case 'D':
//                System.out.print( "Dog");
//                break;
//            case 'E':
//                System.out.print( "Easy");
//                break;
//            case 'F':
//                System.out.print( "Fox");
//                break;
//            case 'G':
//                System.out.print( "George");
//                break;
//            case 'H':
//                System.out.print( "How");
//                break;
//            case 'I':
//                System.out.print( "Item");
//                break;
//            case 'J':
//                System.out.print( "Jig");
//                break;
//            case 'K':
//                System.out.print( "King");
//                break;
//            case 'L':
//                System.out.print( "Love");
//                break;
//            case 'M':
//                System.out.print( "Mike");
//                break;
//            case 'N':
//                System.out.print( "Nan");
//                break;
//            case 'O':
//                System.out.print( "Oboe");
//                break;
//            case 'P':
//                System.out.print( "Peter");
//                break;
//            case 'Q':
//                System.out.print( "Queen");
//                break;
//            case 'R':
//                System.out.print( "Roger");
//                break;
//            case 'S':
//                System.out.print( "Sugar");
//                break;
//            case 'T':
//                System.out.print( "Tare");
//                break;
//            case 'U':
//                System.out.print( "Uncle");
//                break;
//            case 'V':
//                System.out.print( "Victor");
//                break;
//            case 'W':
//                System.out.print( "William");
//                break;
//            case 'X':
//                System.out.print( "X-ray");
//                break;
//            case 'Y':
//                System.out.print( "Yoke");
//                break;
//            case 'Z':
//                System.out.print( "Zebra");
//                break;
//            default:
//                System.out.print(alphabet);
//                break;
//        }
}
