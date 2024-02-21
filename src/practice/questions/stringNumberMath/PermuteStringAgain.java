package practice.questions.stringNumberMath;

import java.util.HashSet;
import java.util.Set;

public class PermuteStringAgain {
    public static void main(String[] args) {
        String str = "abcd";
        PermuteStringAgain permuteStringAgain = new PermuteStringAgain();
        permuteStringAgain.permuteAndPrint(str);
    }

    public static void permuteAndPrint(String str) {
        permuteAndPrint("", str,"",1);
    }
    private static void permuteAndPrint(String prefix, String str1,String str2,int level) {
        String str = str1 + str2;
        level = level+1;
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) , str.substring(0, i),level);
            }
        }
    }

    public static Set<String> permuteAndStore(String str) {
        return permuteAndStore("", str);
    }
    private static Set<String> permuteAndStore(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }
}
