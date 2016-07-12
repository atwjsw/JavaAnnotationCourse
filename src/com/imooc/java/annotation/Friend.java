package com.imooc.java.annotation;

public class Friend {
	
	//调用Deprecated的方法，编译器会给出警告，但仍然可以用
	//由于有些公司要求代码不允许出现警告。此时可以在调用Deprecated方法的方法上使用@SuppressWarnings注解
	@SuppressWarnings("deprecation")
	public void listen() {
		Person p = new Child();		
		p.sign();
	}

}
