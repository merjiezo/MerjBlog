package com.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	public String value() default "";
	public String method() default "GET";

}
