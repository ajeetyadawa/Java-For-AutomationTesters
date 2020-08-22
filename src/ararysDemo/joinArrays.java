package ararysDemo;

import java.util.Arrays;

import org.apache.poi.util.ArrayUtil;

public class joinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = { "Sebastian", "Mack", "Andrews", "Matt","Sachin", "Bret Li" };
		String[] family = { "Rick", "Johny", "Gerry", "Merin", "Pandya", "Rohit" };
		long currentTime = System.currentTimeMillis();
		addtwoStringArrays(friends, family);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Execution Time: "+(endTime-currentTime));
	}

	public static void addtwoStringArrays(String[] arr1, String[] arr2) {
		int len = arr1.length + arr2.length;
		String[] result = new String[len];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		int count = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			result[count + i] = arr2[i];
		}
		for(int k=0; k<result.length;k++) {
		System.out.println("Printed Arrays: " + result[k]);
		}
	}

}
