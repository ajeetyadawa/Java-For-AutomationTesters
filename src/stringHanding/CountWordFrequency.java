package stringHanding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequency {

    public static void main(String[] args) {
        String[] strings = {"AA", "BB", "BB", "CCC", "DD", "AA", "QA", "CCC"};
        // Find the frequency of each array element
        List<String> stringList = Arrays.asList(strings);
        var result = stringList.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                ).entrySet().stream().filter(n -> n.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result);


    }

}
