package stringbuilder;

public class stringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("StringBuilderA");
		sb.append("StringBuilderB");
		System.out.println(sb.append("StringBuilderC"));
		sb.append('D');
		System.out.println(sb);
		sb.trimToSize();
		
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.ensureCapacity(27);
		System.out.println("capacity of String BUilder: "+sb.capacity());

	}

}
