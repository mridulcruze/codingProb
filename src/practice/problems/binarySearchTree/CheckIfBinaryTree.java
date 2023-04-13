package practice.problems.binarySearchTree;

public class CheckIfBinaryTree {
    Node root;
    public static void main(String[] args) {
        CheckIfBinaryTree cIBT=new CheckIfBinaryTree();
        cIBT.root = new Node(10);
        cIBT.root.left = new Node(8);
        cIBT.root.left.left = new Node(6);
        cIBT.root.left.left.left = new Node(4);
        cIBT.root.left.left.left.left = new Node(2);
        boolean isBST = cIBT.checkIfBST(null, cIBT.root.left,Direction.LEFT)
                && cIBT.checkIfBST(null, cIBT.root.right,Direction.RIGHT);
        System.out.println(isBST);
    }

    private boolean checkIfBST(Node parent, Node node,Direction direction) {
        if(node !=null){
            if(parent !=null) {
                if (direction == Direction.LEFT && node.data > parent.data) {
                    return false;
                }
                if (direction == Direction.RIGHT && node.data < parent.data) {
                    return false;
                }
            }
            return checkIfBST(node,node.left,Direction.LEFT) &&
                    checkIfBST(node,node.right,Direction.RIGHT);
        }
        return true;
    }
}
enum Direction{
    LEFT , RIGHT;
}