package con.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeText {
	
	public static void main(String[] arg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		String str = "con.text.Content";
		Object realClass = Class.forName(str).newInstance();		
		Class<?> clazz = realClass.getClass();
		String[] obj1 = { new String("Merjiezo") };
		Method method = clazz.getDeclaredMethod("printContent", null);
		method.invoke(realClass, null);
	}

}
