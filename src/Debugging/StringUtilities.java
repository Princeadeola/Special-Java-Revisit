package Debugging;

// try to fix this bug and if you are unable, you drop a comment and I will show the error
public class StringUtilities {
    private StringBuilder builder = new StringBuilder();
    private int charAdded = 0;

    public void addChar(StringBuilder builder, char c){
        this.builder.append(c);
        charAdded++;
    }
}

