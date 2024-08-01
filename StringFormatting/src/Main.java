public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" + "\t\u2022 First Point\n" + "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 23;
        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Your year of birth is %d%n", yearOfBirth);

        System.out.printf("Your age is %.2f%n",(float)age);

        for (int x = 1; x <= 100000; x*=10) {
            System.out.printf("Printing %6d %n", x);
        }

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}