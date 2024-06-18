public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Kapil",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Disha",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Saumya",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Harshit",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Anup",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}