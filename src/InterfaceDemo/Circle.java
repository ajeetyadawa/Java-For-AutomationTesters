package InterfaceDemo;

/*
 * Static method access only static variables.
 * While non static method can access static and non static variables.
 * Static method created at class level and available for all the instances.
 */
public class Circle implements shape{

	public static int radius=0;
	
	@Override
	public void draw() {
		System.out.println("Circle drawn!");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	public static void main(String [] args) {
		radius =5;
		Circle circle = new Circle();
		circle.draw();
		System.out.println("Area of Circle: "+circle.getArea());
		System.out.println("Radius of Circle: "+Circle.radius);
	}
	
	
	
}
