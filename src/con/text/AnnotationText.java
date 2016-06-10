package con.text;

import com.controller.ControllerMethodimpl;
import com.render.HomeController;

public class AnnotationText {
	
	public static void main(String[] arg) {
		Boolean bl = ControllerMethodimpl.getControllerMethod(HomeController.class, "index");
		System.out.println(bl);
	}

}
