package com.imooc.java.annotation;

/**
 * @author ewendia
 * չʾJDK Annotation
 */
@Description("I am class annotation")
public class Child extends Parent implements Person {
	
	//1����ע��Override�ķ�������ȷOverride�˸����ӿ��еķ���������������ᱨ��
	//�����Person�е�Child��ע��������������Ȼ�������ʱname����û��@overrideע�⣬�򲻻ᱨ��
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
	
	//Deprecated����̳���û�о����
	@Override
	public String sign() {
		return null;
	}

}
