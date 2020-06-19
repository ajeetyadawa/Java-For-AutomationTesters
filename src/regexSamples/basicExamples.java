package regexSamples;

public class basicExamples {

	public static void main(String[] args) {
		/*
		 * This is the program to reverse sentence by words. 
		 * 		 */
		
		String t = "Hey This is ThoughsCoder! We are coding for you!";
		String [] arr = t.split("\\s");
		System.out.println("Size of Array"+arr.length);
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nReversing the sentence!");
		for(int k=arr.length-1; k>=0; k--) {
			System.out.print(" "+arr[k]);
		}
		
		
	}
	

}
