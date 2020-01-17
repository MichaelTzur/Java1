package Question3;

public class PalindromArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,2,1};

        boolean balanced = isPalindrome(array);

        if (balanced) {
            System.out.println("המערך הוא פלינדרום");
        }
        else {
            System.out.println("המערך אינו פלינדרום");
        }
    }
    public static boolean isPalindrome(int[] arr) {

        boolean palindrom = true;
        int counter1 = 0, counter2 = arr.length -1;

        while (counter1 < counter2 && palindrom) {

            if (arr[counter1] != arr[counter2]) {
                palindrom = false;
            }
            counter1++;
            counter2--;
        }
        return palindrom;
    }
}
