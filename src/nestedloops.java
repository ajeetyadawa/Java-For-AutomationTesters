
public class nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int k=0;
while(i<3) {
	for(int j=0; j<4;j++) {
		k=0;
		do{
			System.out.println("value of i:  "+i+ "value of j:  "+j +"value of k: "+k);
			k++;
		} while(k<5);
	}
		i++;
}
	}

}
