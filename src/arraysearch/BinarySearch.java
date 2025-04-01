package arraysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = { 23, 45, 11, 12, 23, 55, 67, 33, 88 };
		int searchElement = 65;
		System.out.println("Is element availablity in array: " + searchedElement(data, searchElement));
	}

	public static boolean searchedElement(int[] arr, int element) {
		Arrays.sort(arr);
		boolean isElementFound = false;
		int result = Arrays.binarySearch(arr, element);
		isElementFound = result > 0 ? true : false;
		if (!isElementFound) {
			System.out.println("Element is  not found");
		}
		return isElementFound;
	}

}
