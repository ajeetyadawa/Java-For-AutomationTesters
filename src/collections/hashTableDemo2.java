package collections;
import java.util.*; 
class hashTableDemo2       
{ 
    public static void main(String[] arg) 
    { 
          // creating a hash table 
        Hashtable marks = new Hashtable(); 
            
        // enter name/marks pair 
        marks.put("tweener", new Integer(345)); 
        marks.put("krantz", new Double(245.78)); 
        marks.put("burrows", new Integer(790)); 
        marks.put("tancredi", new Double(365.98)); 
        marks.put("bellick", new Integer(435)); 
            
           
        // check whether a value exists or not 
        if (marks.contains(345)) 
            System.out.println("value found in table"); 
         
} 
}
