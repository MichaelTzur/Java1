package Question3;

import javax.swing.*;

public class RepeatedDigits {

    public static void main(String[] args) {

        String strNum = JOptionPane.showInputDialog("enter number");
        int num = Integer.parseInt(strNum);

        boolean repeatDigit = checkRepeatDigit(num);

        if (repeatDigit) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    public static boolean checkRepeatDigit(int num) {

        int[] array = new int[10];

        while (num != 0) {
            int rightDigit = num % 10;
            array[rightDigit]++;
            num = num / 10;
        }
        boolean repeatDigit = false;
        int i = 0;

        while (i < 10 && !repeatDigit) {
            if (array[i] > 1) {
                repeatDigit = true;
            }
            i++;
        }
        return repeatDigit;
    }
}
