public class Question3 {

    public static void matrixReverse(int[][] arr) {

        for (int row = arr.length - 1; row > 0; row--) {

            for (int col = 0; col <= row; col++) {

                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }

    public static void printMatrix(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {{0,1,2,3}, {9,0,1,2}, {8,9,0,1}, {7,8,9,0}};
        printMatrix(arr);

        System.out.println();

        matrixReverse(arr);
        printMatrix(arr);
    }
}
