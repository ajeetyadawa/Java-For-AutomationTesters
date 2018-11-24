package newIheritance;

public class Box {
private double width;
private double height;
private double depth;
// Construct clone of Object
Box(Box ob){// pass object to Constructor
	width = ob.width;
	height = ob.height;
	depth = ob.depth;
}
// Constructor used when all dimension specified
Box(double w, double h, double d){
	
	width =w;
	height =h;
	depth =d;
	}
// Constructor used when cube is created
Box(){
	width =-1;
	height =-1;
	depth =-1;
	}
Box(double len){
	width = height = depth =len;
}
double volume() {
	return width*height*depth;
}
}
