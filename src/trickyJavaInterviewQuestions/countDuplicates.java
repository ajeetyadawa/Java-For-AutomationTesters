package trickyJavaInterviewQuestions;

/*
 * This is the  most frequent interview question. 
 * Q: Write a Java program to print duplicate characters
 * input array = {1,1,2,3,4,5,5, 6,6};
 * output duplicate elements: 1,5,6
 */
public class countDuplicates {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,5, 6,6};
		
		for(int i=0; i <array.length-1; i++) {
			for(int k=1; k<array.length;k++) {
				if(i!=k && array[i]==array[k]) {
					System.out.print(array[i]+"\t");
					break;
				}
			}
		}

	}

	
	
}
