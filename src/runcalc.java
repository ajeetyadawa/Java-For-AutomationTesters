
public class runcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calc = new calculator();
		int sum= calc.getsum(10,4);
		System.out.println(sum);
		System.out.println(calc.getdiv(45, 75));
		System.out.println(calc.getmultiply(45,99));
		System.out.println(calc.getsubtract(45, 75));
	}
	
}
