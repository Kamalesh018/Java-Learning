public class Main {
    public static  void displayHighScorePosition(String playerName, int highScore){
        System.out.println(playerName + " managed to get into position "
                + highScore + " on the high score table ");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500 && score <1000) {
            return 2;
        }
        else if(score >= 100 && score < 500){
            return 3;
        }else
        return 4;
    }

    public static void main(String[] args) {
        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("kamalesh",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("kavin",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("suthir",HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("dinesh",HighScorePosition);
    }
}
