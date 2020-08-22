package InterfaceDemo;

public class Triangle implements shape {

	int base=0;
	int height=0;
	
	
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.base=7;
		triangle.height=9;
		triangle.draw();
		System.out.println("Area of triangle: "+ triangle.getArea());

	}

	@Override
	public void draw() {
	System.out.println("Triangle drawn successfully!!");
		
	}

	@Override
	public double getArea() {
		
		return 0.5*base*height;
	}

}
