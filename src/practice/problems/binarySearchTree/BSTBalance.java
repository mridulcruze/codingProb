package practice.problems.binarySearchTree;

import java.util.Vector;

public class BSTBalance {
    static Node root;
    Vector<Node> nodes = new Vector<>();

    public static void main(String[] args) {
        BSTBalance bl = new BSTBalance();
        root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(6);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(2);
        bl.createInorder(root);
        root = bl.balanceTree(0, bl.nodes.size() - 1);
    }

    private Node balanceTree(int start, int end) {
        if(start<=end){
            int mid = (start+end)/2;
            Node midNode = nodes.get(mid);
            midNode.left=balanceTree(start,mid-1);
            midNode.right = balanceTree(mid+1,end);
//            System.out.println(midNode.data +" left -> "+midNode.left==null?"NA":midNode.left.data
//                    +" right -> "+midNode.data==null?"NA":midNode.right.data);
            return midNode;
        }
        return null;
    }

    private void createInorder(Node node) {
        if (node != null) {
            createInorder(node.left);
            nodes.add(node);
            createInorder(node.right);
        }
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}