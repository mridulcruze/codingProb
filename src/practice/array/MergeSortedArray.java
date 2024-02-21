package practice.array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 4, 6, 7, 13};
        int arr2[] = new int[]{2, 3 ,4, 5, 8, 9, 11};
        int merged[] = new int[arr1.length + arr2.length];
        int l = 0, m = 0, n = 0;

        while (l < arr1.length && m < arr2.length) {
            if (arr1[l] < arr2[m]) {
                merged[n] = arr1[l];
                l++;
            } else {
                merged[n] = arr2[m];
                m++;
            }
            n++;
        }
        while (l < arr1.length) {
            merged[n] = arr1[l];
            l++;
            n++;
        }
        while (m < arr2.length) {
            merged[n] = arr2[m];
            m++;
            n++;
        }
        System.out.println(Arrays.toString(merged));
    }
}
