package hashingcode;

public class basicHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ascii("AABCSSDSS", 3));
System.out.println(ascii("AABDssSSDSS", 3 ));
	}
static int ascii(String input, int mode) {
	char ch[];
	ch= input.toCharArray();
	int i, sum;
	for(sum=0, i=0; i<ch.length;i++) {
		sum += ch[i];
	}
		return sum % mode;
}
}
