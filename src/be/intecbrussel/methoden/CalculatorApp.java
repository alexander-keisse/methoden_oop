package be.intecbrussel.methoden;

public class CalculatorApp {

    public static void main(String[] args) {

        double number1 = 14.25;
        double number2 = 125.63;

        double result = Calculator.addition(number1, number2);
        Calculator.printResult(result);

        result = Calculator.subtraction(number1, number2);
        Calculator.printResult(result);

    }

}
