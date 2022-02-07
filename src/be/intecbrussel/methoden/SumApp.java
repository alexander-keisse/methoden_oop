package be.intecbrussel.methoden;

public class SumApp {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        String resultMsg = "Result: ";

        int result = a + b;
        System.out.println(resultMsg + result);

        result = sum(14, 25);
        System.out.println(resultMsg + result);

        float floatResult = sum(14.23F, 13.2525F);
        System.out.println(resultMsg + floatResult);


    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static float sum(float number1, float number2) {
        return number1 + number2;
    }


}
