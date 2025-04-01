package java8Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringFromArray {
    public static void main(String [] args){
        String [] names = {"aaa", "abc", "def", "abc" , "def", "abc", "dfe", "iko"};
        Map<String, Integer> nameMap= Arrays.asList(names).stream()
                .collect(Collectors.toMap(Function.identity(), word->1, Math::addExact));
        System.out.println(nameMap.toString());
        HashSet<String> uniqueName= new HashSet<>();
        for(String n: names){
            if(!uniqueName.add(n)){
                System.out.println(n);
            }
        }

    }
}
