package InterfaceDemo;

public class Square  implements shape {

	public int length=0;
	public int width =0;
	
	public Square(int length, int width ) {
		this.length=length;
		this.width=width;
	}
	
	
	public static void main (String[] args) {
		Square square = new Square(10,20);
		square.draw();
		System.out.println("Area of Square: "+ square.getArea());
		
	}
		

	
	@Override
	public void draw() {
		
		System.out.println("Square drawn !");
	}

	@Override
	public double getArea() {
		return length*width;
	}
	
	
}
