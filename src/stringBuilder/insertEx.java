package stringBuilder;

public class insertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb= new StringBuilder("hello team");
sb.append("qaedupoint");
System.out.println(sb.append("test"));
sb.append('A');
System.out.println(sb);
sb.trimToSize();
System.out.println(sb);
System.out.println(sb.reverse());
System.out.println(sb.capacity());
sb.ensureCapacity(27 );
System.out.println(sb.capacity());

	}

}
