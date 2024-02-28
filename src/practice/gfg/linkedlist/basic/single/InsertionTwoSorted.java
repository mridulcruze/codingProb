package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;

public class InsertionTwoSorted {
    public static void main(String[] args) {
        Node nd = null;
        Node headNd = null;
        practice.gfg.linkedlist.util.Node lst1 = LinkedUtil.addedData(1,2,3,4,5).get(0);
        practice.gfg.linkedlist.util.Node lst2 = LinkedUtil.addedData(2,3,4,6).get(0);
        while (lst1 != null && lst2 != null) {
            if (lst1.getData() == lst2.getData()) {
                if (nd == null) {
                    nd = new Node(lst1.getData());
                    headNd = nd;
                } else {
                    nd.nextNode = new Node(lst1.getData());
                    nd = nd.nextNode;
                }
                lst1 = lst1.getNextNode();
                lst2 = lst2.getNextNode();
            } else if(lst1.getData() < lst2.getData()){
                lst1 = lst1.getNextNode();
            }else{
                lst2 = lst2.getNextNode();
            }
        }
        while (headNd != null) {
            System.out.print(headNd.data + " ");
            headNd = headNd.nextNode;
        }
    }
}
