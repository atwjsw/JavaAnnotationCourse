package com.imooc.java.annotation;

public class Friend {
	
	//����Deprecated�ķ�������������������棬����Ȼ������
	//������Щ��˾Ҫ����벻������־��档��ʱ�����ڵ���Deprecated�����ķ�����ʹ��@SuppressWarningsע��
	@SuppressWarnings("deprecation")
	public void listen() {
		Person p = new Child();		
		p.sign();
	}

}
