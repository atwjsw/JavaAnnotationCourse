package com.imooc.java.annotation;

/**
 * @author ewendia
 * JDK Annotation ��ʾ
 * 
 */
//JDK����ע�����@Override @Deprecated @SuppressWarnings
public interface Person {
	
	public String name();
	
	public String age();
	
	//2���������sign������������룬��Ϊ���������˶���sign����ȡ���������Ѿ����������������������
	//��ʱ����ͨ��@Deprecatedע�����������ʹ���߱���ʹ�ô˷�������ʱ���Child�����ʹ�ñ������������
	@Deprecated
	public String sign();

}
