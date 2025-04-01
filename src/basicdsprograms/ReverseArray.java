package basicdsprograms;


import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		String[] inputArray = {"Chris", "Liam", "David"};
		ReverseArray reversearray = new ReverseArray();
		if (!reversearray.isArrayNull(inputArray)) {
			String [] str= new String[inputArray.length];
			str=  Arrays.copyOf(reversearray.reverseArray(inputArray), inputArray.length, String[].class);
		for(String st : str){
			System.out.println(st);
		}
		}
	}
public boolean isArrayNull(Object [] obj){
		if(obj.length>=0){
			return false;
		}
		else {
			return true;
		}
}
	public Object [] reverseArray(Object [] inputArray){
		int size = inputArray.length;
		System.out.println("Array Size"+size);
		Object [] objects = new Object[size];
		for(int i = 0; i<=size-1;i++){
			objects[i]=inputArray[size-i-1];
		}
		return objects;
	}


}
