
public class OOps_pract_missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = { 1, 2,3, 4,5,6,7,8,9};
int sumOfArray=0;
for(int i=0; i<array.length;i++) {
	sumOfArray = sumOfArray + array[i];
}
System.out.println("Sum of all elements of arrays : "+sumOfArray);
int sumOf10Numbers= 10*11/2;
int missNo= sumOf10Numbers- sumOfArray;
System.out.println("Missing Number : "+ missNo);
	}

}
