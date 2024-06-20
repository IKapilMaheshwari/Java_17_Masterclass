public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Kapil",500);
//        System.out.println("New score is: " + newScore);
//
//        calculateScore(75);
//        calculateScore();

        System.out.println("New score is: " + calculateScore("Kapil",500));
        System.out.println("New score is: " + calculateScore(10));
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }
    public static int calculateScore( int score){
        return calculateScore("Anonymous",score);
//        System.out.println("Unnamed player scored " + score + " points.");
//        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }
}