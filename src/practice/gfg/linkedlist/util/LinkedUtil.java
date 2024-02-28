package practice.gfg.linkedlist.util;

import java.util.ArrayList;
import java.util.List;

public class LinkedUtil {

    public static List<Node> addedData(int... arr) {
        List<Node> lst = new ArrayList<>();
        Node preEle = null;
        for (int ele : arr) {
            Node nd = new Node(ele, null);
            if (preEle != null) {
                preEle.nextNode = nd;
                preEle = nd;
            } else {
                preEle = nd;
            }
            lst.add(nd);
        }
        return lst;
    }

    public static List<DNode> addedDData(int... arr) {
        List<DNode> lst = new ArrayList<>();
        DNode preEle = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                preEle = new DNode(arr[0], null, null);
                lst.add(preEle);
                continue;
            }
            DNode nd = new DNode(arr[0], null, preEle);
            preEle.next = nd;
            preEle = nd;
            lst.add(nd);
        }
        return lst;
    }

    public static Node getHeadNode(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = i + 1;
        }
        return addedData(arr).get(0);
    }

}

