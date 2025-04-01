package day3arrays;

public class twoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=3;
int columns=3;
int table[][] =new int[rows][columns];
table[0][0]=10;
table[0][1]=11;
table[0][2]=13;

table[1][0]=10;
table[1][1]=11;
table[1][2]=11;

table[2][2]=13;
table[2][0]=10;
table[2][1]=11;
System.out.println(table.length);// row length;
System.out.println(table[0].length);// column length
System.out.println(table[0][0]);
for(int i=0;i<rows;i++) {
	for (int j=0;j<columns;j++) {
		System.out.println(" "+table[i][j]);
		
	}}
	System.out.println("  ");


	}

}
