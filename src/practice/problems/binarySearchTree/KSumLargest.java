package practice.problems.binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class KSumLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{10, -10, 20, -40};
        int k = 3;
        ArrayList<Integer> cumulativeSum = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                cumulativeSum.add(sum);
            }
        }

        Collections.sort(cumulativeSum, Collections.reverseOrder());
        System.out.println(cumulativeSum.get(k - 1));
    }
}
