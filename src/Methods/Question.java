package Methods;

public class Question {
    public static void main(String[] args) {
        int highScore = calculate(true, 800, 5, 100);
        System.out.println("The final score is " + highScore);


        highScore = calculate(true, 1000, 8, 200);
        System.out.println("The final score is " + highScore);
    }

    public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
