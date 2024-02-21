package practice.problems.binarySearchTree;

import java.util.Arrays;

public class RotateTechnique {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        doReverse(arr, k, false);
        System.out.println(Arrays.toString(arr));
        doReverse(arr, k, true);
        System.out.println(Arrays.toString(arr));

    }

    private static void doReverse(int[] arr, int k, boolean combined) {
        if (combined) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            return;
        }
        for (int i = 0; i < (arr.length - k); i++) {
            if (i >= arr.length - k - 1 - i) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[arr.length - k - 1 - i];
            arr[arr.length - k - 1 - i] = temp;
        }

        for (int i = arr.length - k, j = 0; i < arr.length; i++, j++) {
            if (i >= arr.length - 1 - j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp;
        }
    }
}
