public class Main {
    public static void main(String[] args) {
        int sum3and5 = 0;
        int count = 0;
        for(int i = 1; i <= 1000 && count<5; i++){
            if(i % 5 == 0 && i % 3 == 0){
                sum3and5 += i;
                count++;
                System.out.println(i + " is divisible by both 3 and 5");
            }
        }
        System.out.println(sum3and5 + " is sum of numbers that are divisible by both 3 and 5");
    }
}