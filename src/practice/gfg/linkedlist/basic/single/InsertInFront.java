package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

import java.util.List;

public class InsertInFront {
    static List<Node> nodesList;

    public static void main(String[] args) {
        nodesList = LinkedUtil.addedData(1, 2, 3, 4);
        Node head = addInFront(0);
        while (head != null) {
            System.out.println(head);
            head = head.getNextNode();
        }
    }

    private static Node addInFront(int data) {
        Node nd = new Node(data, nodesList.get(0));
        nodesList.add(nd);
        return nd;
    }
}

