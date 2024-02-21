package practice.questions.stringNumberMath;

import java.util.stream.Collectors;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "cabcdecdecde";
        Character findMe = 'c';
        Long count = str.chars().filter(obj->obj==findMe)
                .count();
        System.out.println(count);
        OccurenceOfCharacter obj=new OccurenceOfCharacter();
        obj.getMe(1,"s","ds");
    }

    void getMe(int i,String...arg){
        System.out.println(arg);
        String res = String.join(",","how","are","you");
        System.out.println(res);
    }
}
