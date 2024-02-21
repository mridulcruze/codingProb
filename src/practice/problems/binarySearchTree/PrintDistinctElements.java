package practice.problems.binarySearchTree;

public class PrintDistinctElements {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 2, 4, 5, 5, 6};
        for (int i = 0; i < arr.length; i++) {

            while(i < arr.length-1 && arr[i]==arr[i+1]) {
                i++;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
