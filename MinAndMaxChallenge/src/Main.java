import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int num, min = 0, max = 0, count = 0;

        while (loop) {
            System.out.println("Enter a number or any character to Quit:");
            String number = scanner.nextLine();
            try {
                num = Integer.parseInt(number);
                if(count==0){
                    min = (max = num);
                }else {
                    if(num<min){
                        min = num;
                    }
                    if(num>max){
                        max = num;
                    }
                }
                count++;
            }catch (NumberFormatException e){
                loop = false;
            }
        }
        if(count==0){
            System.out.println("You have not entered a number");
        } else {
            System.out.println("The minimum number is: " + min);
            System.out.println("The maximum number is: " + max);
        }
    }
}