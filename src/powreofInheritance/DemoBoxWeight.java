package powreofInheritance;

public class DemoBoxWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BoxWeight mybox1= new BoxWeight(10,20,15,34.3);
BoxWeight mybox2= new BoxWeight(2,3,4,5.5);
double vol;
vol =mybox1.volume();
System.out.println("Volumee of mybox1 is "+vol);
System.out.println("weight of my box is "+mybox1.weight);
System.out.println();
vol= mybox2.volume();
System.out.println("Volumee of mybox2 is "+vol);
System.out.println("weight of my box is "+mybox2.weight);
System.out.println();
	}

}
