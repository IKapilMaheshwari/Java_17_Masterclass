public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");

        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++){
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                count++;
//                if(count == 3){
//                    System.out.println("Found 3 - Exiting for loop");
//                    break;
//                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}