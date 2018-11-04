package ployMorphism;

public class citi extends RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
citi  obj= new citi();
System.out.println(obj.getCarLoanROI());
System.out.println(obj.getHomeLoanROI());
RBI obj1= new citi();
	}
public double getHomeLoanROI() {
	return 10.5;
}

public Integer show() { /// Covariant
	return 10;
}
}
