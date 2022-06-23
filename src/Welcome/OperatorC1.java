package Welcome;

public class OperatorC1 {
    public static void main(String[] args) {

        double num1 = 20.0;
        double num2 = 80.0;

        double num3 = (num1 + num2) * 100.0;
        double result = num3 % 40.0;

        //boolean isZero = (result == 0) ? true : false;
        boolean isZero = result == 0; //same as the commented
        System.out.println(isZero);

        if (!isZero){
            System.out.println("Got some remainder");
        }
    }
}
