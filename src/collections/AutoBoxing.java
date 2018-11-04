package collections;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int var =10;
		Float obj= new Float(var);
		System.out.println("Conversion of Variable into Float Object"+obj);    /// primitive value converted into Object 

		float i= obj; // unwrapping
		
		System.out.println("unwrapped obeject"+i);
		
		Integer obj1= new Integer(var);
		System.out.println("Conversion of Variable into Integer Object"+obj1);    /// primitive value converted into Object 

           int  j= obj1; // unwrapping
		   System.out.println("unwrapped obeject"+ j); 
		   
		   
		Double obj2= new Double(var);
		System.out.println("Conversion of Variable into Double Object"+obj2);    /// primitive value converted into Object 

		
		Long obj3= new Long(var);
		System.out.println("Conversion of Variable into Long Object"+obj3);  
		
	}

}
