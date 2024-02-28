package practice.gfg.linkedlist.basic.single;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(11);
        head.nextNode = new Node(11);
        head.nextNode.nextNode = new Node(11);
        head.nextNode.nextNode.nextNode = new Node(11);
        head.nextNode.nextNode.nextNode.nextNode = new Node(12);
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(13);
        Node nd = head;
        while (nd.nextNode != null) {
            if (nd.data == nd.nextNode.data) {
                nd.nextNode = nd.nextNode.nextNode;
            } else {
                nd = nd.nextNode;
            }
        }
        nd = head;
        while (nd != null) {
            System.out.print(nd.data + " ");
            nd = nd.nextNode;
        }
    }
}

class Node {
    int data;
    Node nextNode;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}
