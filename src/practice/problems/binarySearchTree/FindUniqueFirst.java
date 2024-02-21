package practice.problems.binarySearchTree;

public class FindUniqueFirst {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,2,5,3};
        int n=arr.length;
        a:for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
