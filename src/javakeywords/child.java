package javakeywords;

public class child {

	int rollnum;
	String name;
	child(int rollnum, String name){
		this.rollnum=rollnum;
		this.name = name;
		// this points to current object
	}
	/*child()
	{
		this(10,12);
		System.out.println("No-arg constructor");
	}*/
	
	public void display() {
		System.out.println("name-->\t"+name+"Rollnum-->"+rollnum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child ch = new child(101,"QA EduPoint");
ch.display();
child ch1 = new child(102,"Automation");
ch.display();
ch1.display();
	}

}
