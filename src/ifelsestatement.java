
public class ifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = (int)(Math.random()*20);
System.out.println(num);
		if(num>10) {
	System.out.println(num+ " is greater than 10 so you win");
}
		else if (num >10 && num<20) {
			System.out.println(num+ " number is in between 10 to 15");
		}
		else {
			System.out.println(num+ " is less than 10 so you lost!!");
		}
	}

}
