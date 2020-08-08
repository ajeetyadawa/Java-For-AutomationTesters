package RecursionDemo;

public class Factorial {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Factorial: "+fact(14));
		long stopTime = System.currentTimeMillis();
        long totalExecution=stopTime -startTime;
        System.out.println("Total Execution Time: "+totalExecution);
        long startTime1 = System.currentTimeMillis();
        System.out.println("Factorial: "+factwithMemoization(14));
        long stopTime1 = System.currentTimeMillis();
        long totalExecution1=stopTime1 -startTime1;
        System.out.println("Total Execution Time: "+totalExecution1);
	}

	public static long fact(long num) {
		long result=0;
		if(num==0 || num ==1) {
			return 1;
		}
		else {
			result= num*fact(num-1);
			return result;
		}
	}
	public static long factwithMemoization(int num) {
		long [] storedFact= new long[num+1];
		if(num<=1) {
			return num; 
		}
		if(storedFact[num]!=0) {
			return storedFact[num];
		}
		else {
			storedFact[num]= num * factwithMemoization(num-1);
			return storedFact[num];
		}
	}
	
	
}
