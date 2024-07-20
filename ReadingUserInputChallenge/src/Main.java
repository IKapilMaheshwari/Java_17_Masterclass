import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int num =0;
        do{

            System.out.println("Enter number #"+count+":");
            String number = scanner.nextLine();
            try {
                num = Integer.parseInt(number);
                count++;
                sum += num;
            } catch (NumberFormatException e){
                System.out.println("Enter a valid number!!!");
            }


        }while (count<=5);
        System.out.println("Total = " + sum);
    }
}