public class Main {
    public static void main(String[] args) {
        int i=5;
        int count = 0;
        while (i<=20){
            i++;
            if(!isEvenNumber(i)){
                continue;
            }
            count++;
            System.out.println(i);
            if(count==5){
                break;
            }
        }
    }
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}