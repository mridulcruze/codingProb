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
}

