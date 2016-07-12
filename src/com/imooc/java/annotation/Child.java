package com.imooc.java.annotation;

/**
 * @author ewendia
 * 展示JDK Annotation
 */
@Description("I am class annotation")
public class Child extends Parent implements Person {
	
	//1）标注了Override的方法都正确Override了父类或接口中的方法，否则编译器会报错
	//如果把Person中的Child类注解掉则编译器保错，然而如果此时name方法没有@override注解，则不会报错
	@Override
	@Description("I am method annotation#1")
	public String name() {
		return null;
	}
	
	@Override
//	@Description("I am method annotation#2")
	public String age() {
		return null;
	}
	
	//Deprecated的类继承是没有警告的
	@Override
	public String sign() {
		return null;
	}

}
