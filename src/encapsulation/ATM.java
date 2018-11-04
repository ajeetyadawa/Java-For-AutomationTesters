package encapsulation;

public class ATM {
	public static void main(String[] args) {
		bank obj = new bank();
	//	obj.pinNo=2222;  pin is accessible outside of programme
		obj.withdrawAmount(123456, 2222,9000);
		
		obj.updatePin(123456, 1234, 3333);
		obj.withdrawAmount(123456, 3333, 1000);
		double p= obj.depositCash(123456, 3333, 10885);
		System.out.println("final balance"+p);
	}
	
}
