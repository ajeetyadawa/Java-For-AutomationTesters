package inheritMemberAccess;

public class B extends A{
int total;
	void sum() {
		total =i +j; // j is not accessible as it is private
	}
   
	
}
