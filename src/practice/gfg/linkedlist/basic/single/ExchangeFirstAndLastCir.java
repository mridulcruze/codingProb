package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

public class ExchangeFirstAndLastCir {
    public static void main(String[] args) {
        Node headNode = LinkedUtil.getHeadNode(8);
        Node lstNode = headNode;
        Node lstScnd = null;
        while (lstNode.getNextNode() != null) {
            lstScnd = lstNode;
            lstNode = lstNode.getNextNode();
        }
        lstNode.setNextNode(headNode);
        //
        lstScnd.setNextNode(headNode);
        lstNode.setNextNode(headNode.getNextNode());
        headNode.setNextNode(lstNode);
        System.out.println();
    }
}
