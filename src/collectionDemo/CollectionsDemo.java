package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String [] args) {
		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 45);
		Product window = new Product("Glass Window", 10);
		Collection<Product> products = new ArrayList<>();
		products.add(door);
		products.add(floorPanel);
		products.add(window);
		System.out.println(products);
		// For each product
		for(Product product: products) {
			if(product.getWeight()>20) {
			System.out.println(product);
			}
		}
		
		Iterator<Product> iterator = products.iterator();
		while(iterator.hasNext()) {
			Product product = iterator.next();
			if(product.getWeight()>20) {
				iterator.remove();
			}
		}
		System.out.println(products);
	}
	
	
}
