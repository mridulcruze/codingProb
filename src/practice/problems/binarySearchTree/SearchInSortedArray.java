package practice.problems.binarySearchTree;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5, 6, 7, 8, 9, 10, 11, 12};
        int ele = 3;
        int pivot = findMePivot(arr, 0, arr.length - 1);
        System.out.println(pivot);
        int[] arr1 = new int[pivot];
        int[] arr2 = new int[arr.length - pivot];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = pivot; i < arr.length; i++) {
            arr2[i - pivot] = arr[i];
        }
        int[] pair1 = findElementByBinarySearch(arr1, ele, 0, arr1.length - 1);
        int[] pair2 = findElementByBinarySearch(arr2, ele, 0, arr2.length - 1);


        System.out.println(pair1[0]+" "+pair1[1]+" and "+pair2[0]+" "+pair2[1]);
    }

    private static int[] findElementByBinarySearch(int[] arr, int ele, int l, int r) {
        if (r > l) {
            int mid = (l + r) / 2;
            if (ele == arr[mid]) {
                return new int[]{arr[mid], mid+1};
            } else if (ele > arr[mid]) {
                return findElementByBinarySearch(arr, ele, mid + 1, r);
            } else {
                return findElementByBinarySearch(arr, ele, l, mid - 1);
            }
        }
        return new int[]{0, 0};
    }

    private static int findMePivot(int[] arr, int l, int r) {
        if (r > l) {
            int mid = (l + r) / 2;
            if (arr[l] > arr[mid]) {
                return findMePivot(arr, l, mid);
            }
            if ((mid + 1) < r && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            return findMePivot(arr, mid + 1, r);
        }
        return r;
    }

}
