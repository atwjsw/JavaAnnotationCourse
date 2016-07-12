package com.imooc.java.annotation;

/**
 * @author ewendia
 * JDK Annotation 演示
 * 
 */
//JDK自有注解包括@Override @Deprecated @SuppressWarnings
public interface Person {
	
	public String name();
	
	public String age();
	
	//2）如果发现sign这个方法不理想，因为并非所有人都能sign，想取消掉，但已经有其他的类在用这个方法
	//此时可以通过@Deprecated注解来告诉类的使用者避免使用此方法。此时如果Child类继续使用编译器会出警告
	@Deprecated
	public String sign();

}
