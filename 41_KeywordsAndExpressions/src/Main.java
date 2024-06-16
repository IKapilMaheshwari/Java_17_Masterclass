public class Main {
    public static void main(String[] args) {
        int int2 = 5;
        double kilometers = (100 * 1.609344);
        //kilometers = (100 * 1.609344) is expresssion.

        int highScore = 50;
        if(highScore>25){
            highScore = 100 + highScore;    //add bonus points
        }

        int health = 100;

        if((health<25)&&(highScore>1000)){
            highScore = highScore - 1000;
        }

        //here 1.health = 100 2.health<25 3.highScore>1000 4.highScore - 1000 5.(health<25)&&(highScore>1000) 6.highScore = highScore - 1000 are Expressions
    }
}