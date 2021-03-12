package builderPattern;

public class MethodChainingDemo {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		student1.setId(123).setName("Ajeet").setAddress(" F 64236243, New Delhi -110030");
		student2.setId(124).setName("AKI").setAddress("BDBBB");
		System.out.println("Student 1 details:"+ student1.toString());
		System.out.println("Student 2 details:"+ student2.toString());
		
	}

}
