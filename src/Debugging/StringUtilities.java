package Debugging;

public class StringUtilities {
    private StringBuilder builder = new StringBuilder();
    private int charAdded = 0;

    public void addChar(StringBuilder builder, char c){
        this.builder.append(c);
        charAdded++;
    }
}
