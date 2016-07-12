package com.imooc.java.annotation.dao;

/**
 * 通过Annotation建立类字段和表结构的映射关系
 * @author ewendia
 *
 */
@Table("department")
public class UserMapper2 implements Filter {
	
	@Column("id")
	private int id;
	
	@Column("dept_name")
	private String deptName;
	
	@Column("manager")
	private String manager;
	
	@Column("headcount")
	private int headcount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getHeadcount() {
		return headcount;
	}

	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}
	
}
