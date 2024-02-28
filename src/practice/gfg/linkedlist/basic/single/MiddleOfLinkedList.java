package practice.gfg.linkedlist.basic.single;

import practice.gfg.linkedlist.util.LinkedUtil;
import practice.gfg.linkedlist.util.Node;

import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        List<Node> linkedList = LinkedUtil.addedData(2,3,4,5,6);
      //  findMiddleUsingRecursion(linkedList.get(0), 1);

        Node stepByOne=linkedList.get(0) , stepbyTwo = linkedList.get(0);
        while(stepbyTwo!=null){
            stepByOne = stepByOne.getNextNode();
            Node intermediate = stepbyTwo.getNextNode();
            if(intermediate==null||intermediate.getNextNode() ==null){
                break;
            }
            stepbyTwo = intermediate.getNextNode();
        }
        System.out.println(stepByOne+" ## ");
    }

    private static int findMiddleUsingRecursion(Node linkedList, int count) {
        int len = 0;
        if (linkedList != null) {
            len = findMiddleUsingRecursion(linkedList.getNextNode(), count + 1);
            if (len == count) {
                System.out.println("This is middle " + count + " " + linkedList);
            }
        } else {
            len = count / 2;
            System.out.println(len + " <- " + count);
        }
        return len;
    }
}
