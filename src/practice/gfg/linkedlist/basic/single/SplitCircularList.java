package practice.gfg.linkedlist.basic.single;

public class SplitCircularList {
    public static void main(String[] args) {
        CNode cn = new CNode(3);
        cn.nextNode = new CNode(4);
        cn.nextNode.nextNode = new CNode(6);
        cn.nextNode.nextNode.nextNode = new CNode(7);
        cn.nextNode.nextNode.nextNode.nextNode = new CNode(11);
        cn.nextNode.nextNode.nextNode.nextNode.nextNode = new CNode(13);

        cn.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = cn;

        CNode fp = cn;
        CNode sp = cn;

        while (sp != null) {
            if (sp.nextNode != null && sp.nextNode != cn && sp.nextNode.nextNode != null && sp.nextNode.nextNode != cn) {
                fp = fp.nextNode;
                sp = sp.nextNode.nextNode;
            } else {
                sp = null;
            }
        }
        CNode lst1 = cn;
        CNode lst2 = fp.nextNode;
        fp.nextNode = null;
        System.out.println("Middle is " + fp.data);
        System.out.println("List 1");
        while (lst1 != null) {
            System.out.print(lst1.data + " ");
            lst1 = lst1.nextNode;
        }
        System.out.println("List 2");

        System.out.println();
        while (lst2 != null && lst2 != cn) {
            System.out.print(lst2.data + " ");
            lst2 = lst2.nextNode;
        }
    }
}

class CNode {
    int data;
    CNode nextNode;

    CNode(int data) {
        this.data = data;
    }

    CNode(int data, CNode cn) {
        this.data = data;
        this.nextNode = cn;
    }
}
