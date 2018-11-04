

public class methodcalling {
// static component ---> non static component directly
	// behavior of method should be same
	// static ---> static
	// non static --> non static, static 
	// static methods are not following OOPS concept..
	// When we write code  then we compile.. then JVM execute main function...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodcalling m= new methodcalling();
		m.go1(); // all methods are called from Main method
		m.go2();
		m.go3();
	//	go3();  this method is cant called....because main fucntion is static function
	}
	public void go1() {
		System.out.println("inside Go Method go1");
		go2();  // - we are able to call them, because both methods are in same class as well same behavior.
	}
		
		
	public void go2() {
		System.out.println("inside Go Method go 2");
		go4();
	}
	public void go3() {
		System.out.println("inside Go Method go3 ");
	}
	public static void go4() {
		System.out.println("inside Go Method go4 ");
		//go1();
	}
}
