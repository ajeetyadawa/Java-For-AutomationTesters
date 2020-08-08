/**
 * 
 */
package RecursionDemo;

import java.util.Arrays;

/**
 * @author ajit
 *
 */
public class Fibonaci {

	/**
	 * @param args
	 * This program is created to calculate fibonaci series of given number
	 * 
	 */
	public static void main(String[] args) {
		int startNum=45;
		int limit =10;
		long startTime= System.nanoTime();
	System.out.println(printFib(startNum));
		long stop= System.nanoTime();
		System.out.println("Total Execution Time: "+(stop-startTime));
		System.out.println(fibonacciMemo(startNum));
		System.out.println("Total Execution Time: "+(System.nanoTime()-stop));
	}
public static int printFib(int startNum) {
	if(startNum<=1) {
		return startNum;
	}
	else
		return printFib(startNum-1) +  printFib(startNum-2);
}
static int fibonacciMemo(int n) {
    // entry table to cache the computed values
    int[] fibs = new int[n + 1];
    // initialize entry table with -1 to say value has to calculated
    Arrays.fill(fibs, -1);
    return fib(n, fibs);
}
static int fib(int n, int[] fibs) {
    if (n == 0 || n == 1) return n;
    if (fibs[n] == -1) {
        fibs[n] = fib(n - 1, fibs) + fib(n - 2, fibs);
    }
    return fibs[n];
}

}
