package practice.gfg.array.easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 7, 0,8,2, 1};
        int m = Integer.MIN_VALUE, sm = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                sm = m;
                m = arr[i];
            }
        }
        System.out.println(sm);
    }
}
