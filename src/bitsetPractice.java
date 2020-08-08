import java.util.BitSet;

public class bitsetPractice {
/*
 * BitSet is the class which is used to create Array of bits.
 * It have two constructor argument - no args and BitSet(no of bits)
 */
	public static void main(String[] args) {
// No args constructors
BitSet bs = new BitSet();
bs.set(45);
bs.set(2);
bs.set(76);
bs.set(75);
System.out.println("No args BitSet bs "+bs);
System.out.println("Size of BitSet: "+bs.size());
//Now BitSet with constructor
BitSet bsConst = new BitSet(5);
bsConst.set(1);
bsConst.set(4);
bsConst.set(6);
bsConst.set(7);
bsConst.set(8);
bsConst.set(9);
bsConst.set(11);
System.out.println("No args BitSet bs "+bsConst);
System.out.println("Size of BitSet: "+bsConst.size());

	}

}
