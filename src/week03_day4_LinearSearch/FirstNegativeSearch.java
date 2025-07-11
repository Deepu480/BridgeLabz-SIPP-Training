package week03_day4_LinearSearch;

public class FirstNegativeSearch {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, -2, 7};
        System.out.println("Index of first negative: " + findFirstNegative(arr));
    }
}
