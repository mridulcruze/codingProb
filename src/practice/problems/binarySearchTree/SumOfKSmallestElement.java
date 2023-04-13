package practice.problems.binarySearchTree;

public class SumOfKSmallestElement {
    Node rootNode;
int sum;
    public static void main(String[] args) {
        SumOfKSmallestElement sumOfKSmallestElement = new SumOfKSmallestElement();
        sumOfKSmallestElement.rootNode = new Node(30);
        sumOfKSmallestElement.rootNode.left = new Node(10);
        sumOfKSmallestElement.rootNode.right = new Node(40);
        sumOfKSmallestElement.rootNode.right.right = new Node(60);
        sumOfKSmallestElement.rootNode.right.left = new Node(35);
        sumOfKSmallestElement.rootNode.left.left = new Node(5);
        sumOfKSmallestElement.showSumOfKSmallestElements(0, 3, sumOfKSmallestElement.rootNode,false);
    }

    private int showSumOfKSmallestElements(int counter, int k, Node node,boolean foundK) {
        if (node != null && counter <k && !foundK) {
            counter = showSumOfKSmallestElements(counter,k,node.left,foundK)+1;
            sum+=node.data;
          //  ++counter;
            if(counter==k){
                System.out.println("Sum is "+sum);
                return 0;
            }
            counter = showSumOfKSmallestElements(counter,k,node.right,foundK)+1;
        }
        return 0;
    }
}
