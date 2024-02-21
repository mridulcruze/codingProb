package practice.questions.stringNumberMath;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permute(str, "");
        int a=10;
        int b=20;
        System.out.println((a>5 ^ b>55));
    }

    public static void permute(String str, String concat) {
        if (str.length() == 0) {
            System.out.println(concat);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0,i)+str.substring(i+1,str.length()),concat+str.charAt(i));

        }
    }
}
