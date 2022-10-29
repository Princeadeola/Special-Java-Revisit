package Inheritance;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberOfGuess = rand.nextInt(50);
        System.out.println(numberOfGuess);
    }
}
