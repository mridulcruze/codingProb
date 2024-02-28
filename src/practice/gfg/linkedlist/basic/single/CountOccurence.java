package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

import java.util.List;

public class CountOccurence {
    public static void main(String[] args) {
        List<Node> lst = LinkedUtil.addedData(2, 4, 3, 5, 3, 4, 6, 4);
        int occToSearch = 4;
        Node headNode = lst.get(0);
        int counter = 0;
        while (headNode != null) {
            if (occToSearch == headNode.getData())
                counter++;
            headNode = headNode.getNextNode();
        }

        System.out.println(counter);
    }
}
