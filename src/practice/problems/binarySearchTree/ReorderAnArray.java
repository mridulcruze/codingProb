package practice.problems.binarySearchTree;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderAnArray {

    static class MyComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[1], b[1]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 2, 6, 8};
        int[] arr2 = new int[]{2, 0, 3, 1};
        int[][] doubleArr = new int[arr1.length][2];
        for (int i = 0; i < arr1.length; i++) {
            doubleArr[i][0] = arr1[i];
            doubleArr[i][1] = arr2[i];
        }

        Arrays.sort(doubleArr, new MyComparator());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = doubleArr[i][0];
            System.out.println(arr1[i]);
        }
    }
}