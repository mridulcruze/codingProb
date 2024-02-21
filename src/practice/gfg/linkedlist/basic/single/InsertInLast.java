package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

import java.util.List;

public class InsertInLast {
    static List<Node> nodesList;

    public static void main(String[] args) {
        nodesList = LinkedUtil.addedData(1, 2, 3, 4);
        Node head = nodesList.get(0);
        addInLast(5, nodesList.get(0));
        addInLast(6, nodesList.get(0));

        addInLast(7, nodesList.get(0));

        while (head != null) {
            System.out.println(head);
            head = head.getNextNode();
        }
    }

    private static void addInLast(int data, Node headNode) {
        Node lastNode = headNode;
        while (lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(new Node(data, null));
    }
}

