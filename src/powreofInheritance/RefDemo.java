package powreofInheritance;

public class RefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BoxWeight weightbox = new BoxWeight(3,5,6,8.398);
Box plainbox = new Box();
double vol;
vol = weightbox.volume();
System.out.println("Volume of weight Box\n"+vol);
System.out.println("Weight of weight Box\n"+weightbox.weight);
System.out.println();
plainbox = weightbox;
vol = plainbox.volume();
System.out.println("Volume of  plainbox is "+vol);
// below satement is invalid becuase plainbox
//System.out.println("Weight of Plain Box"+plain.weight);
	}

}
