package Question3;

import javax.swing.*;

public class DigitsInDifferentPlace {

    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog("enter number");
        int num1 = Integer.parseInt(strNum1);

        String strNum2 = JOptionPane.showInputDialog("enter number");
        int num2 = Integer.parseInt(strNum2);

        int amountOfDigitsInSamePlace = amountOfDigitsInSamePlace(num1, num2);
        int amountOfTotalRepeatedDigits = amountOfTotalRepeatedDigits(num1, num2);
        int answer = amountOfTotalRepeatedDigits - amountOfDigitsInSamePlace;

        System.out.println(answer);
    }
    public  static int amountOfDigitsInSamePlace(int num1, int num2) {

        int counter = 0;

        while (num1 != 0) {
            if (num1 % 10 == num2 % 10) {
                counter++;
            }
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return counter;
    }
    public static int amountOfTotalRepeatedDigits(int num1, int num2) {

        int[] digit1 = new int[10];

        if (num1 == 0){
            digit1[0]++;
        }
        else {
            while (num1 != 0) {
                int rightDigit1 = num1 % 10;
                digit1[rightDigit1]++;
                num1 = num1 / 10;
            }
        }
        int[] digit2 = new int[10];

        if (num2 == 0) {
            digit2[0]++;
        }
        else {
            while (num2 != 0) {
                int rightDigit2 = num2 % 10;
                digit2[rightDigit2]++;
                num2 = num2 / 10;
            }
        }
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            if (digit1[i] > 0 && digit2[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}
