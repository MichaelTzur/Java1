package Question3;

public class BalancedArray {

    public static void main(String[] args) {

        int[] array = {20, 20, 30, 70};

        boolean balance = isBalanced(array);

        if (balance) {
            System.out.println("the array is balanced");
        } else {
            System.out.println("the array is not balanced");
        }
    }
    public static boolean isBalanced(int[] arr) {

        boolean balance = false;
        int dividePoint = 0;

        while (dividePoint < arr.length - 1 && !balance) {

            int sum1 = 0;
            for (int i = 0; i <= dividePoint; i++) {
                sum1 = sum1 + arr[i];
            }
            int sum2 = 0;
            for (int j = dividePoint + 1; j <= arr.length - 1; j++) {
                sum2 = sum2 + arr[j];
            }
            if (sum1 == sum2) {
                balance = true;
            }
            dividePoint++;
        }
        return balance;
    }
}
