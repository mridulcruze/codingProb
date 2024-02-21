package practice.gfg.array.easy;

import java.util.Arrays;

public class largestThreeDistinct {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 66,34,56,1, 6};
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                c = b;
                b = a;
                a = arr[i];
            } else if (arr[i] > b) {
                c = b;
                b = arr[i];
            } else if (arr[i] > c) {
                c = arr[i];
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
