package practice.problems.binarySearchTree;

public class RecursiveFibonaci {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        int count = 10;
        int[] fibonaciArr = new int[count];
        fibonaciArr[0] = 0;
        int sum = 0 ;
        recCall(0, count, 0,fibonaciArr);
    }

    private static int recCall(int sum, int count, int digit,int[] fibonaciArr) {
        if (count < 11) {
            fibonaciArr[digit] = sum;
            sum += digit;
            return recCall(sum, ++count, ++digit , fibonaciArr);
        } else
            return sum;
    }
}
