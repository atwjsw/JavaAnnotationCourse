package com.imooc.java.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ע���������CONSTRUCTOR,FIELD,LOCAL_VARIABLES,METHOD,PACKAGE,PARAMETER,TYPE)
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //�����������÷�Χ��SOURCE,CLASS,RUNTIME)
@Inherited //��������̳�ע��
@Documented //����Javadocʱ�����ע����Ϣ
public @interface Description {
	
	String value();
	
//	String desc();	
//	
//	String author();	
//	
//	int age() default 18;	
}
