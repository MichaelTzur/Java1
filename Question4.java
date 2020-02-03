public class Question4 {

    public static boolean[][] showMazePath(boolean[][] arr, int row, int col) {

        System.out.println(row + ", " + col);

        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println("success!");

            return arr;
        }
        if (row < arr.length - 1 && arr[row + 1][col]) {
            arr[row][col] = false;

            return showMazePath(arr, row + 1, col);
        }
        else if (col < arr[0].length - 1 && arr[row][col + 1]) {
            arr[row][col] = false;

            return showMazePath(arr, row, col + 1);
        }
        else if (row > 0 && arr[row - 1][col]) {
            arr[row][col] = false;

            return showMazePath(arr, row, row - 1);
        }
        else if (col > 0 && arr[row][col - 1]) {
            arr[row][col] = false;

            return showMazePath(arr, row, col - 1);
        }
        return arr;
    }

    public static void main(String[] args) {

        boolean[][] arr = {{true, true, true, true ,true},
                        {false, false, false, false, true},
                        {true, true, true, true ,true},
                        {true, false, false, false, false},
                        {true, true, true, true ,true}};

        showMazePath(arr, 0 ,0);
    }
}
