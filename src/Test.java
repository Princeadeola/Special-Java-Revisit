import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = input.nextInt();

        final double PI = 3.14;
        double area = 2*PI*(radius * radius);
        System.out.println("Area = " + area);
    }
}
