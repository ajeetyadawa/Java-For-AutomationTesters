package powreofInheritance;

public class Box {
double width;
double depth;
double height;
// Construct object
Box(Box ob){ // pass object to Constructor
	width = ob.width;
	depth= ob.depth;
	height = ob.height;
}

// Constructor used when all dimensions specified
Box(double w, double h, double d){
	width =w;
	height =h;
	depth =d;
}
// Constructor used when no dimensions specified
 Box(){
	width =-1;
	height =-1;
	depth =-1;
	
 }// Constructor when Cube is created
Box(double len){
		width =height =depth =len;
	}
	double volume() {
		return width*height*depth;
	}
}

