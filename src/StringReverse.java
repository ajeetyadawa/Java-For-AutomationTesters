
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class StringReverse {
    public static void main(String [] args){
        String inputString ="SACHINTENDULKAR";
        StringReverse stringReverse = new StringReverse();
        System.out.println("***************Reverese String Using Loop ********************************");
        stringReverse.reverseStringUsingLoop(inputString);
        System.out.println("***************Reverese String Using StringBuilder ********************************");
        stringReverse.reverseStringByBuilder(inputString);
        System.out.println("***************Reverese String Using StringBuffer ********************************");
        stringReverse.reverseByBuffer(inputString);
        System.out.println("***************Reverese String Using Collections ********************************");
        stringReverse.reverseByCollections(inputString);
    }
    public void reverseStringUsingLoop(String givenString){
        String newString="";
                if(isStringNotNull(givenString)){
                    for(int i =0; i<=givenString.length()-1; i++){

                        newString=givenString.charAt(i)+newString;
                    }
                }
                else{
                    System.out.println("Enter Valid String");
                }
        System.out.println(newString);
    }

    public void reverseStringByBuilder(String givenString){
        StringBuilder sb = new StringBuilder(givenString);

        if(isStringNotNull(givenString)) {
            System.out.println(sb.reverse());
        }
        else{
            System.out.println("Enter Valid String");
        }
    }

    public void reverseByBuffer(String givenInput){
        StringBuffer buffer = new StringBuffer(givenInput);
        if(isStringNotNull(givenInput)){
            buffer.reverse();
            System.out.println(buffer.toString());
        }

    }
public void reverseByCollections(String inputString){
        if(isStringNotNull(inputString)){
            char [] ch = inputString.toCharArray();
            List<Character> str = new ArrayList<>();
            for(Character character : ch){
                str.add(character);
            }
            Collections.reverse(str);
            Iterator<Character> itr = str.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next());
            }
    }
}

    public boolean isStringNotNull(String input){
       boolean isNull=true;
       if(input.isBlank()|| input.isEmpty()){
           isNull =false;
       }
       return isNull;
    }
}
