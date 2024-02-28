package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

public class NodesCountCirc {
    public static void main(String[] args) {
        Node headNode = LinkedUtil.getHeadNode(6);
        int cnt = 1;
        Node nd = headNode.getNextNode();
        while (nd != null && nd != headNode) {
            cnt++;
            nd = nd.getNextNode();
        }
        System.out.println(cnt);
    }
}
