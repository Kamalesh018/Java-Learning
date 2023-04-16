public class Main {
    public static void main(String[] args) {
        boolean GameOver = true;
        int score = 4000;
        int LevelCompleted = 5;
        int bouns = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("greater than 5000 and less than 1000");
//        } else if (score < 1000){
//            System.out.println("less than 1000");
//        }else {
//            System.out.println("got here");
//        }
        int Score = 1000;
        int levelCompleted = 800;
        int Bouns = 200;
        if (GameOver == true){
            int finalScore = score + (LevelCompleted * bouns);
            System.out.println("your finalscore is:" + finalScore);
            int newfinalScore = Score + (levelCompleted * Bouns);
            System.out.println("your newfinalscore is:" + newfinalScore);
        }

    }

}
