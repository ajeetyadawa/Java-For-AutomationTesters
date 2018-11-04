package collections;

import java.util.*; 
class hashtableEnumerator       
{ 
    public static void main(String[] arg) 
    { 
          // creating a hash table 
        Hashtable h = new Hashtable(); 
         
     
           
        h.put(3, "QAEdupoint"); 
        h.put(2, "forSelenium"); 
        h.put(1, "isBest"); 
           
        // create enumeration  
   Enumeration e = h.elements(); 
      
   System.out.println("display values:"); 
      
    while (e.hasMoreElements()) { 
   System.out.println(e.nextElement());} 
} 
} 
