public class Question2 {

    public static boolean isSorted(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length - 1; j++) {

                if (arr[i][j] > arr[i][j + 1]) {
                    return false;
                }
            }
            if (i < arr.length - 1 && arr[i][arr[i].length -1] > arr[i + 1][0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4}, {5,6,7,8}};

        System.out.println(isSorted(arr));
    }
}
