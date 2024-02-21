package practice.problems.binarySearchTree;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];
        int rotateCnt = 8 % arr.length;
        int j = 0;
        for (int i = arr.length - rotateCnt; i < arr.length; i++) {
            j = i - (arr.length - rotateCnt);
            newArr[j] = arr[i];
        }
        j = j == 0 ? j : j + 1;
        for (int i = 0; j < arr.length; i++) {
            newArr[j++] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "  ");
        }

        String verb = "driver";

        switch (verb) {
            case "manager":
                System.out.println("manager it is");
                break;
            case "driver":
                System.out.println("Driver it is");
                break;
            default:
                System.out.println("defsult it is");
                break;
        }
    }
}
