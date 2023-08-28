public class Calculator {
    private final double firstValue;
    private final double secondValue;
    Calculator(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double addFirstAndSecondAndMultiplyBy100(){
        return (firstValue + secondValue) * 100;
    }
}
