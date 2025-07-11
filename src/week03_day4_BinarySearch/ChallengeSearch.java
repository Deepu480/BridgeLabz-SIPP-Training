package week03_day4_BinarySearch;
import java.util.Arrays;

public class ChallengeSearch {
    public static int findFirstMissingPositive(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) return i;
        }
        return nums.length + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findFirstMissingPositive(arr));

        Arrays.sort(arr);
        int target = 1;
        System.out.println("Index of target: " + binarySearch(arr, target));
    }
}
