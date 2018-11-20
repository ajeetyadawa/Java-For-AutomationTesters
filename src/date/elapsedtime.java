package date;

public class elapsedtime {
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(5000);
			long endtime = System.currentTimeMillis();
			long diff= endtime-start;
			System.out.println("Difference of time:\t "+diff);
		}catch(Exception e) {
			System.out.println("Exception Found");
		}
	}
}
