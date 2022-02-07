package be.intecbrussel.methoden;

import java.util.Scanner;

public class FindLowestValueApp {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String ASK_INPUT = "Fill in a number please: ";

        System.out.println(ASK_INPUT);
        int firstNumber = kbd.nextInt();
        System.out.println("First number is: " + firstNumber);

        System.out.println(ASK_INPUT);
        int secondNumber = kbd.nextInt();
        System.out.println("Second number is: " + secondNumber);

        int lowestValue = findLowestValue(firstNumber, secondNumber);
        System.out.println("The lowest value is: " + lowestValue);

    }


    public static int findLowestValue(int firstNumber, int secondNumber) {
//        return (firstNumber > secondNumber) ? secondNumber : firstNumber;
        return Math.min(firstNumber, secondNumber);
    }

}
