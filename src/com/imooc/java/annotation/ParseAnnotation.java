package com.imooc.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnnotation {
	
	public static void main(String[] args) {
		
		try {
			//1. 使用类加载器加载类
			Class clazz = Class.forName("com.imooc.java.annotation.Child");
			//2. 检测类注解
			boolean isExist = clazz.isAnnotationPresent(Description.class);
			if(isExist) {
				//3. 拿到注解实例和打印注解内容
				Description desc = (Description)clazz.getAnnotation(Description.class);
				System.out.println(desc.value());	
			}
			//4. 找到所有方面
			Method[] methods = clazz.getMethods();
			for(Method m: methods){
				boolean isMExist = m.isAnnotationPresent(Description.class);
				if(isMExist) {
					//5. 拿到注解实例和打印注解内容
					Description desc = (Description)m.getAnnotation(Description.class);
					System.out.println(desc.value());	
				}
			}
			
			//另一种解析方法
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
