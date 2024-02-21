package practice.problems.binarySearchTree;

public class ArrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 4, -2, 6 , 9};

        int n = arr.length;

        int pointer = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                pointer += 1;
                int temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int j = 0;
        pointer = pointer + 1;
        while (j < pointer && pointer < n && arr[j] < 0) {
            int temp = arr[j];
            arr[j] = arr[pointer];
            arr[pointer] = temp;
            j += 2;
            pointer += 1;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
