package builderPattern;

/*
 * Author: Ajeet
 * Creation Date: 10/10/2020
 * Method Chaining is inconsistent 
 */
public class ConcurrentReciever {

	private final Student student = new Student();

	public ConcurrentReciever() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(123).setName("Ajeet").setAddress("F 654, Delhi -110030");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				student.setId(124).setName("Abhi").setAddress("GIC BSBS");
			}
		});

		t1.start();
		t2.start();
	}

	public Student getStudent() {
		return student;
	}

}
