public class Question2 {

    public static boolean isMatrixSorted(int[][] arr) {

        return isMatrixRowsSorted(arr, 0);
    }

    private static boolean isMatrixRowsSorted(int[][] arr, int row) {

        if (row == arr.length) {
            return true;
        }
        if (!isMatrixCellsInRowSorted(arr, row, 0, 1)) {
            return false;
        }
        int IndexOfLastCellInRow = arr[row].length - 1;

        if (row < arr.length - 1 && arr[row][IndexOfLastCellInRow] > arr[row + 1][0]) {
            return false;
        }
        return isMatrixRowsSorted(arr,row + 1);
    }

    private static boolean isMatrixCellsInRowSorted(int[][] arr, int row, int leftIndex, int rightIndex) {

        if (leftIndex == arr[row].length - 1) {
            return true;
        }
        if (arr[row][leftIndex] > arr[row][rightIndex]) {
            return false;
        }
        return isMatrixCellsInRowSorted(arr, row , leftIndex + 1, rightIndex + 1);
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(isMatrixSorted(arr));
    }
}
