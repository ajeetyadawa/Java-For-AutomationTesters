package collectionDemo;

import java.util.Arrays;

public class TheArrayProblem {

	public static void main(String[] args) {
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 45);
		Product window = new Product("Glass Window", 10);
		// Initialize array of PRoduct
		Product[] products = { door, floorPanel };
		System.out.println(Arrays.toString(products));
		// add - new Element in array
	//	products[2] =window;  Arrays are not resizeable in nature
		System.out.println(Arrays.toString(products));
		// Add new array using metgid
		add(window, products);
		System.out.println(Arrays.toString(products));
		
		// add duplicate element in array
		add(window, products);
		
	}
private static Product[] add(Product product, Product [] array) {
	
	Product [] tempArray= Arrays.copyOf(array, array.length+1);
	tempArray[array.length]= product;
	return tempArray;
}
	
	
}
