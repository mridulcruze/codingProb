package practice.problems.binarySearchTree;

import java.util.Vector;

public class SortedArrayToBST {
    Node headNode;

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        SortedArrayToBST satb = new SortedArrayToBST();
        satb.headNode = satb.createBST(arr, satb.headNode, 0, arr.length - 1);
        System.out.println(satb.headNode);
    }

    private Node createBST(int[] arr, Node node, int start, int end) {
        if (end >= start) {
            int mid = (start + end) / 2;
            node = new Node(arr[mid]);

            node.left = createBST(arr, node.left, start, mid - 1);
            node.right = createBST(arr, node.right, mid + 1, end);
            return node;
        }
        return null;
    }
}
