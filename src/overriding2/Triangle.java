package overriding2;

public class Triangle extends Figure {
Triangle(double a, double b){
	super(a,b);
}
double area() {
	System.out.println("Inside area of Traingle");
	return  dim1*dim2/2;
}
}
