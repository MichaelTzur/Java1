public class Question1 {

    public static int[][] matrixMultiplication(int[][] arr1, int[][] arr2) {

        int[][] newMatrix = new int[arr1.length][arr2[0].length];

        for (int row = 0; row < newMatrix.length; row++) {

            for (int col = 0; col < newMatrix[0].length; col++) {

                newMatrix[row][col] = multiplyMatricesCells(arr1, arr2, row, col);
            }
        }
        return newMatrix;
    }

    private static int multiplyMatricesCells(int[][] arr1, int[][] arr2, int row, int col) {

        int sum = 0;

        for (int i = 0; i < arr2.length; i++) {

            sum = sum + arr1[row][i] * arr2[i][col];
        }
        return sum;
    }

    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr1 = {{1,5}, {2,3}, {1,7}};
        int[][] arr2 = {{1,2,3,7}, {5,2,8,1}};

        int[][] multiplicationMatrix = matrixMultiplication(arr1, arr2);

        printMatrix(multiplicationMatrix);
    }
}