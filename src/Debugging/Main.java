package Debugging;

public class Main {

    public static void main(String[] args) {
        StringUtilities utilities = new StringUtilities();
        StringBuilder stringBuilder = new StringBuilder();

        while (stringBuilder.length() < 10){
            utilities.addChar(stringBuilder, 'a');
        }

        System.out.println(stringBuilder);
    }
}
