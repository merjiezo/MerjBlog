package com.controller;

import java.lang.reflect.Method;

public class ControllerMethodimpl {

	public static Boolean getControllerMethod(Class<?> clazz, String method) {
		Method[] methods = clazz.getDeclaredMethods();
		for (Method meth : methods) {
			if (meth.isAnnotationPresent(Controller.class)) {
				Controller controller = (Controller) meth.getAnnotation(Controller.class);
				String val = controller.value();
				if (method.equals(val)) {
					return true;
				}
			}
		}
		return false;
		
	}

}
