package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test t = new test();
Class clazz = t.getClass();
System.out.println(clazz.getSimpleName());
Constructor[] cons  = clazz.getDeclaredConstructors();
Method[] arrayofMethods= clazz.getDeclaredMethods();
System.out.println(arrayofMethods.length);
for (Constructor con: cons) {
	System.out.println(con.getName());
}
for( Method m: arrayofMethods) {
	System.out.println(m.getName()+"--Return type is: --"+m.getReturnType());
	Parameter[] params = m.getParameters();
	for(Parameter param: params) {
		System.out.println(param.getName());
	}
}
	}
}
