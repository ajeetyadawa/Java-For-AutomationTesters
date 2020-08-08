package ArraySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class searchyList {

	public static void main(String[] args) {
		
int [] data = {23,23,23, 67, 87, 54};
int searchNum=87;
System.out.println("Is Element Present: "+searchMethod(data, searchNum));
	}
public static boolean searchMethod(int [] arr, int num) {
	Arrays.sort(arr);
	boolean isElementPresent=false;
	for(int i: arr) {
		if(i==num) {
			isElementPresent=true;
			break;
		}
	}
	return isElementPresent;
}
}
