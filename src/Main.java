public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(20, 80);
        System.out.println(RemainderDetector
                .detectRemainderWithValue(calculator.addFirstAndSecondAndMultiplyBy100(), 50));
        calculator = new Calculator(30, 80);
        System.out.println(RemainderDetector
                .detectRemainderWithValue(calculator.addFirstAndSecondAndMultiplyBy100(), 51));
    }
}