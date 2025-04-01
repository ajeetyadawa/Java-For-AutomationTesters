package stringHanding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MAXString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("TOAAAAAAAAAAAAAAAAAAAAAAAM", "BRIAN", "MICHAEL", "TESTAUTOMATIOn");
        String biggestString = String.valueOf(strings.stream().max(Comparator.comparingInt(String::length)));
        System.out.println(biggestString);

    }
}
