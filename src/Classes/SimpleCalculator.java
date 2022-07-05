package Classes;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double sum = firstNumber + secondNumber;
        return sum;
    }

    public double getSubtractionResult(){
        double sum = firstNumber - secondNumber;
        return sum;
    }

    public double getMultiplicationResult(){
        double sum = firstNumber * secondNumber;
        return sum;
    }

    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        double sum = firstNumber / secondNumber;
        return sum;
    }


}
