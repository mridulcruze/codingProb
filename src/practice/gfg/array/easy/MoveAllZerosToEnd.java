package practice.gfg.array.easy;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 4, 6, 5, 0, 2, 3, 0};
        int pivot = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                --pivot;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
