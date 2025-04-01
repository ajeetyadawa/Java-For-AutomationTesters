package builderpatternconcurrentdemo;

public class StudentReceiver {

	private final Student student = new Student();
	public StudentReceiver() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(234).setName("Ajeet").setAddress("Bhimpura No1 ");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(12345).setName("Kumar").setAddress("Varanasi ");
			}
		});
		t1.start();
		t2.start();
	}
	public Student getStudent() {
		return student;
	}
	
	
}
