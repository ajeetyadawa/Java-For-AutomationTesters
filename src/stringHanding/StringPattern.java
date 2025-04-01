package stringHanding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPattern {

    public static void main(String [] args){
        String email ="sachin.tendulkar@gmail.com";
        // Writing program to Print Sachin.Tendulkar@gmail.com
        String [] str = email.split("@");

        StringBuilder sb = new StringBuilder();

        List<String> temp = Arrays.asList(str);
        String [] str2=  temp.get(0).split("\\.");
        List<String> temp2 = Arrays.asList(str2);


        String string1 = temp2.get(0).substring(0, 1).toUpperCase() +   temp2.get(0).substring(1);
        String string2 = temp2.get(1).substring(0, 1).toUpperCase() +   temp2.get(1).substring(1);



        sb.append( string1).append(".").
                append(string2).append("@").append(temp.get(1));



System.out.println(sb);
// try with java 8
   temp.stream().collect(Collectors.toList())
                .forEach(n->n.toUpperCase());

    }
}
