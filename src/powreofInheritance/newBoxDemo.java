package powreofInheritance;

public class newBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newboxWeight mybox1= new newboxWeight (10,20,15,34.3);
		newboxWeight  mybox2= new newboxWeight (2,3,4,5.5);
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
