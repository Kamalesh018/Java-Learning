public class Main {
    public static void main(String[] args) {
        calculateScore("kamalesh", 100);
        int newScore = calculateScore("bala", 200);
        System.out.println("Newscore is " + newScore);
        calculateScore(100);
        calculateScore();
//MethodOverloading must have the unique method.
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points ");
        return score * 100;
    }
    public static int calculateScore( int score){
        System.out.println("Unplayer name was score " + score + " points ");
        return score * 100;
    }
    public static int calculateScore(){
        System.out.println("No player name was score points ");
        return  0;
    }
}



