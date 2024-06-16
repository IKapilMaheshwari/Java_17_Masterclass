public class Main {
    public static void main(String[] args) {
        double num = 20.00d;
        double num2 = 80.00d;
        double num3 = (num+num2)*100.00d;
        System.out.println("Step 3 result: " + num3);
        num3 = num3%40.00d;
        System.out.println("Step 4 result: " + num3);
        boolean bool = num3==0 ? true:false;
        System.out.println("Step 6 result: " + bool);
        if(!bool){
            System.out.println("got some remainder" );
        }
    }
}