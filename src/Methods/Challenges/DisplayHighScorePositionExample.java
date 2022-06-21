package Methods.Challenges;

public class DisplayHighScorePositionExample {

    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("James", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Jane", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Joe", highScore);
    }

    public static void displayHighScorePosition(String playName, int position){
        System.out.println(playName + " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playScore){

//        if (playScore >= 1000){
//            return 1;
//        } else if (playScore >= 500) {
//            return 2;
//        } else if (playScore >= 100) {
//            return 3;
//        }
//        return 4;
        // alternative below
        int position = 4;
        if (playScore >= 1000){
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        } else if (playScore >= 100) {
            position = 3;
        }
        return position;
    }
}
