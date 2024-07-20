import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi, " + name );
        String dateOfBirth = System.console().readLine("Hi, What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("So, you are " + age + " years old");

        return "";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);
        //String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name );
        //String dateOfBirth = System.console().readLine("Hi, What year were you born?");
        System.out.println("What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear-125) + " and <= " + (currentYear));
            try {
                age = checkDate(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            }catch (NumberFormatException e){
                System.out.println("Characters not allowed!!! Try again");
            }
        }while (!validDOB);

        return "So, you are " + age + " years old";
    }

    public static int checkDate(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear-dob;
    }
}