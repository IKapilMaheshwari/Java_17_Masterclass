public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(-125));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        if(n < 0)
            return -1;
        while(n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit;
        }
        return sum;
    }
}