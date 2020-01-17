package Question3;

import javax.swing.*;

public class digitsInSamePlace {

    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog("enter number");
        int num1 = Integer.parseInt(strNum1);

        String strNum2 = JOptionPane.showInputDialog("enter number");
        int num2 = Integer.parseInt(strNum2);

        int counter = amountOfDigitsInSamePlace(num1, num2);

        System.out.println(counter);
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
}
