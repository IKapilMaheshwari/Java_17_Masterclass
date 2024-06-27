public class Main {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printWeekDay(10);
    }
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println(day + " is Sunday");
            case 1 -> System.out.println(day + " is Monday");
            case 2 -> System.out.println(day + " is Tuesday");
            case 3 -> System.out.println(day + " is Wednesday");
            case 4 -> System.out.println(day + " is Thursday");
            case 5 -> System.out.println(day + " is Friday");
            case 6 -> System.out.println(day + " is Saturday");
            default -> System.out.println(day + " is Invalid day");
        }
    }
    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println(day + " is Sunday");
        }
        else if (day == 1) {
            System.out.println(day + " is Monday");
        }
        else if (day == 2) {
            System.out.println(day + " is Tuesday");
        }
        else if (day == 3) {
            System.out.println(day + " is Wednesday");
        }
        else if (day == 4) {
            System.out.println(day + " is Thursday");
        }
        else if (day == 5) {
            System.out.println(day + " is Friday");
        }
        else if (day == 6) {
            System.out.println(day + " is Saturday");
        }
        else {
            System.out.println(day + " is Invalid day");
        }
    }
}