
public class breakCount {

	public void go() {
		System.out.println("First");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 9; i++)

			if (i >= 0) {
				if (i == 5 || i == 7) {

					System.out.println("print the value of i :" + i);
					continue;
				}
				break;
			}

		System.out.println("outside of loop");

	}
}
