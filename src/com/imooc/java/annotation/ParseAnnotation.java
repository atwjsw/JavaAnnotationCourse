package com.imooc.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnnotation {
	
	public static void main(String[] args) {
		
		try {
			//1. ʹ���������������
			Class clazz = Class.forName("com.imooc.java.annotation.Child");
			//2. �����ע��
			boolean isExist = clazz.isAnnotationPresent(Description.class);
			if(isExist) {
				//3. �õ�ע��ʵ���ʹ�ӡע������
				Description desc = (Description)clazz.getAnnotation(Description.class);
				System.out.println(desc.value());	
			}
			//4. �ҵ����з���
			Method[] methods = clazz.getMethods();
			for(Method m: methods){
				boolean isMExist = m.isAnnotationPresent(Description.class);
				if(isMExist) {
					//5. �õ�ע��ʵ���ʹ�ӡע������
					Description desc = (Description)m.getAnnotation(Description.class);
					System.out.println(desc.value());	
				}
			}
			
			//��һ�ֽ�������
			for(Method m: methods){
				Annotation[] as = m.getAnnotations();
				for(Annotation a: as) {
					Description desc = (Description)a;
					System.out.println(desc.value());	
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
