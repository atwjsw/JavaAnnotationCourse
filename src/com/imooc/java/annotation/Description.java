package com.imooc.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解的作用域（CONSTRUCTOR,FIELD,LOCAL_VARIABLES,METHOD,PACKAGE,PARAMETER,TYPE)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //生命周期作用范围（SOURCE,CLASS,RUNTIME)
@Inherited //允许子类继承注解
@Documented //生成Javadoc时会包含注解信息
public @interface Description {
	
	String value();
	
//	String desc();	
//	
//	String author();	
//	
//	int age() default 18;	
}
