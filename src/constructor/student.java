package constructor;

public class student {
	String StudentName;
	int rollNum;
	public student(String studentName, int rollNum)                // 
	{                           // constructor never returns anything
	                         // constuctor must be created in Same class 
	/*
	 * type of Constructor (Singleton Class
	 *  default Constructor
	 *  no argument 
	 *  parameterized Constrcutor
	 */
		this.StudentName = studentName;
		this.rollNum= rollNum;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student obj = new student("RICKY", 101);
		System.out.println(obj.StudentName);
		System.out.println(obj.rollNum);
		

	}

}
