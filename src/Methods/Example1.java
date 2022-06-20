package Methods;

public class Example1 {
    public static void main(String[] args) {
        calculate(true, 800, 5, 100);
    }

    public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println(finalScore);
        }
    }
}
