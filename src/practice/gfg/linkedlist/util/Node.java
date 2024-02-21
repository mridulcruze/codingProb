package practice.gfg.linkedlist.util;

public class Node {
    Integer data;
    Node nextNode;

    public Node(int data, Node node) {
        this.data = data;
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
