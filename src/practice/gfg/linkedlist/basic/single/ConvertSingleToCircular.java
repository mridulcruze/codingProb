package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

public class ConvertSingleToCircular {

    public static void main(String[] args) {
        Node headNode = LinkedUtil.getHeadNode(6);
        Node lstNode = headNode;
        while (lstNode.getNextNode() != null) lstNode = lstNode.getNextNode();
        lstNode.setNextNode(headNode);
        System.out.println(lstNode);


    }
}
