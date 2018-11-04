package encapsulation;

public class bank {

	public int accountNo=123456;
	private int pinNo= 1234; // if pin will be public then it should be accessible outside so we use private
	public double balanceAmount=100000;

	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public void withdrawAmount(int accNo, int pin, double amount) {
		if (accNo==accountNo && pin == pinNo) {
			if(amount <=balanceAmount) {
				System.out.println("transection Successful:\t" +amount);
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		else {
			System.out.println("Invalid credentials!!!");
		}
	}
		public double depositCash(int accNo, int pin, double amount) {
			if (accNo==accountNo && pin ==pinNo)
				balanceAmount = balanceAmount + amount;
			return balanceAmount;
		}
	public void updatePin(int accNo, int oldPin, int newPin) {
		if (accNo==accountNo && oldPin== pinNo) {
			pinNo=newPin;
			System.out.println("Pin Changed Successfully!!");
			
		}
	}
}
