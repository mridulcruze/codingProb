package practice.problems.binarySearchTree;

public class NumberOfRotations {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 9, 11, 12, 15 , 2};
        int pivot = fetchRepeatedIndex(arr);
        System.out.println("Rotations are :- "+pivot);
    }

    private static int fetchRepeatedIndex(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return i+1;
                }
            }
        }
        return 0;
    }
}
