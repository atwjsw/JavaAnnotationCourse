package com.imooc.java.annotation.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * build query based on filter input
 * @author ewendia
 * 
 */
public class QueryBuilder {

	public String query(Filter filter) {	
		StringBuilder sb = new StringBuilder();
		//1. ��ȡ����
		Class clazz = filter.getClass();
		//2. ��ȡTable����
		boolean tExist = clazz.isAnnotationPresent(Table.class);
		if(!tExist) {
			return null;
		}				
		Table table = (Table)clazz.getAnnotation(Table.class);
		sb.append("select * from " + table.value() + " where 1=1");
		//3. ���������ֶ�
		Field[] fields = clazz.getDeclaredFields();
		for (Field field: fields) {	
			//4 ����ÿ���ֶε�sql
			//4.1 ��ȡ�ֶ���
			boolean cExist = field.isAnnotationPresent(Column.class);
			if (!cExist) {
				continue;
			}
			Column column = (Column)field.getDeclaredAnnotation(Column.class);
			String columnName = column.value();
			//4.2 �õ��ֶε�ֵ
			String methodName = "get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
			Object o =  null;
			try {
				Method getMethod = clazz.getMethod(methodName);
				o = getMethod.invoke(filter);
			} catch (Exception e) {				
				e.printStackTrace();
			} 
			//ƴװsql
			if (o==null){
				continue;
			}
			if ((o instanceof Integer) && ((Integer)o).intValue()==0){
				continue;
			}
			sb.append(" and ").append(column.value());
			if (o instanceof String) {
				String[] arrStr = o.toString().split(",");
				if (arrStr.length>1){
					sb.append(" in(");
				for (int i=0;i<arrStr.length;i++) {
					sb.append("'").append(arrStr[i].trim()).append("'");
					if (i!=arrStr.length-1){
						sb.append(",");
					}
				}
				sb.append(")");
				} else {
					sb.append("='").append(o).append("'");
				}
			} else if (o instanceof Integer) {
				sb.append("=").append(o);
			}
		}
		return sb.toString();
	}

}
