package practice.problems.binarySearchTree;

public class ReorderArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 1, 2};
        int[] arrm = new int[]{2, 1, 0, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[arrm[i]]) {
                int temp = arr[arrm[i]];
                arr[arrm[i]] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
