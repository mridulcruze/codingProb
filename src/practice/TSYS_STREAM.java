package practice;

import java.util.Arrays;
import java.util.List;

public class TSYS_STREAM {
    static List<String> lst= Arrays.asList("manu","sonal","ankit","sunil");

    public static void main(String[] args) {
        lst.parallelStream().forEach(System.out::println);
    }
}
