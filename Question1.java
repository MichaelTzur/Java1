public class Question1 {

    public static void main(String[] args) {

        int[] arr = {0,1,2,4,4,4,6,7,8,9};
        int num = 4;

        int lowerLimitOfNum = lowerLimit(arr, num);
        int upperLimitOfNum = upperLimit(arr, num);

        int AmountOfAppearances = upperLimitOfNum - lowerLimitOfNum + 1;

        System.out.println(AmountOfAppearances);
    }

    public static int upperLimit(int[] arr, int num) {

        int start = 0, last = arr.length - 1;

        while (start <= last) {
            int middle = (start + last) / 2;

            if (arr[middle] > num) {
                last = middle - 1;
            }
            else if (arr[middle] < num) {
                start = middle + 1;
            }
            else {
                start = middle;

                if (arr[start] == arr[last]) {
                    return last;
                }
                if (last - start == 1) {
                    return start;
                }
            }
        }
        return -1;
    }

    public static int lowerLimit(int[] arr, int num) {

        int start = 0, last = arr.length - 1;

        while (start <= last) {
            int middle = (start + last) / 2;

            if (arr[middle] > num) {
                last = middle - 1;
            }
            else if (arr[middle] < num) {
                start = middle + 1;
            }
            else {
                last = middle;

                if (arr[start] == arr[last]) {
                    return start;
                }
            }
        }
       return 0;
    }
}
