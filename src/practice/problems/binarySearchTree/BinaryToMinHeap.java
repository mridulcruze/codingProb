package practice.problems.binarySearchTree;

import java.util.Vector;

public class BinaryToMinHeap {

    Node rootNode;
    int counter;

    public static void main(String[] args) {
        BinaryToMinHeap bTMH = new BinaryToMinHeap();
        bTMH.rootNode = new Node(30);
        bTMH.rootNode.left = new Node(10);
        bTMH.rootNode.right = new Node(40);
        bTMH.rootNode.right.right = new Node(60);
        bTMH.rootNode.right.left = new Node(35);
        bTMH.rootNode.left.left = new Node(5);
        bTMH.rootNode.left.right = new Node(15);
        Vector<Integer> inorderNodes = new Vector<>();
        bTMH.inorderLoadingData(inorderNodes, bTMH.rootNode);
        System.out.println(inorderNodes);
        bTMH.preOrderLoadingNodes(inorderNodes,bTMH.counter,bTMH.rootNode);
        System.out.println(bTMH.rootNode);
    }

    private int preOrderLoadingNodes(Vector<Integer> inorderNodes, int counter, Node node) {
        if(node!=null){
            node.data = inorderNodes.get(counter++);
            counter = preOrderLoadingNodes(inorderNodes,counter,node.left);
            counter = preOrderLoadingNodes(inorderNodes,counter,node.right);
        }
        return counter;
    }

    private void inorderLoadingData(Vector<Integer> inorderNodes, Node node) {
        if(node!=null){
            inorderLoadingData(inorderNodes,node.left);
            inorderNodes.add(node.data);
            inorderLoadingData(inorderNodes,node.right);
        }
    }
}
