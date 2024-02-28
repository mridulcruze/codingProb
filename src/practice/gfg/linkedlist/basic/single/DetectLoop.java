package practice.gfg.linkedlist.basic.single;

public class DetectLoop {
    public static void main(String[] args) {

    }
}

class DetectionNode {
    int data;

    boolean isVisited;
    DetectionNode nextNode;

    DetectionNode(int data ,boolean isVisited , DetectionNode nextNode ){
        this.data = data;
        this.isVisited  = isVisited;
        this.nextNode = nextNode;
    }
}
