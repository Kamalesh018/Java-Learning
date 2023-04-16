public class Main {
    public static int  calculatorScore(boolean gameOver,int score, int levelcompleted, int bouns) {        // suppose we use datatype instead of datatype we want to use return statement.

        if (gameOver) {
            int  finalscore = score + (levelcompleted * bouns);
            finalscore += 2000;
            System.out.println("the final score is:" + finalscore);
            return finalscore;
        }
        return -1;
    }
    public static void main(String[] args) {
        calculatorScore(true,800,5,100);
        calculatorScore(true,1000, 8, 200);
       }
}
