package practice.problems.binarySearchTree;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TR {
    public static void main(String[] args) {
        Set<String> locs = Arrays.stream(Locale.getAvailableLocales()).map(obj->obj.getCountry()).collect(Collectors.toSet());
      //  List<Locale> locs =Arrays.stream(Locale.getAvailableLocales()).collect(Collectors.toList());

        System.out.println(locs);
    }
}
