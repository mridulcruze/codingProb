package practice.questions.stringNumberMath.prob2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepetitive {
    public static void main(String[] args) {
        String str="abc deabd";
        System.out.println(new StringBuilder(str).reverse());
        Map<Character,Boolean> mp = new LinkedHashMap<>();
        str.chars().forEach(obj->
            mp.compute((char)obj,(k,v)->v==null?true:(v==true?false:false)));

        System.out.println(mp);
        for(Map.Entry<Character,Boolean> et: mp.entrySet()){
            if(et.getValue()==true){
                System.out.println("got it , it was "+et.getKey());
                break;
            }
        }
    }
}
