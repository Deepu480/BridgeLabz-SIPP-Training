package week03_day3_SortingAglorithms;

public class CountingSortStudentAges {
 public static void main(String[] args) {
     int[] ages = {12, 15, 11, 14, 10, 18, 13};
     int max = 18;
     int min = 10;

     countingSort(ages, min, max);

     System.out.println("Sorted Ages:");
     for (int age : ages) {
         System.out.print(age + " ");
     }
 }

 public static void countingSort(int[] arr, int min, int max) {
     int range = max - min + 1;
     int[] count = new int[range];

     for (int num : arr) {
         count[num - min]++;
     }

     int index = 0;
     for (int i = 0; i < range; i++) {
         while (count[i]-- > 0) {
             arr[index++] = i + min;
         }
     }
 }
}

