package Question3;

import javax.swing.*;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {

        Random rnd = new Random();
        int num1 = rnd.nextInt(101);

        for (int i = 0; i < 5; i++) {
            String strNum = JOptionPane.showInputDialog("enter number");
            int num2 = Integer.parseInt(strNum);

            checkNum(num1, num2);

            if (num1 == num2) {
               return;
            }
            if (i == 4) {
                System.out.println("the number is " + num1);
            }
        }
    }
    public static void checkNum(int num1, int num2) {

        if (num2 > num1) {
            System.out.println("too high");
        } else if (num2 < num1) {
            System.out.println("too low");
        } else {
            System.out.println("congratulations! " + num2 + " is the number.");
        }
        return;
    }
}
