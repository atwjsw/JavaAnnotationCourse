package com.imooc.java.annotation.dao;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit≤‚ ‘”√¿˝£¨≤‚ ‘QueryBuilder
 * @author ewendia
 *
 */
public class TestQueryBuilder {

	@Test
	public void testQuery1() {
		QueryBuilder qb = new QueryBuilder();
		UserMapper filter =  new UserMapper();
		filter.setUserName("atwjsw");
		String sql = qb.query(filter);
		System.out.println("sql: " + sql);
	}
	
	@Test
	public void testQuery2() {
		QueryBuilder qb = new QueryBuilder();
		UserMapper filter =  new UserMapper();
		filter.setUserName("atwjsw");
		filter.setAge(46);
		filter.setEmail("daniel.wen@ericsson.com");
		String sql = qb.query(filter);
		System.out.println("sql: " + sql);
	}
	
	@Test
	public void testQuery3() {
		QueryBuilder qb = new QueryBuilder();
		UserMapper filter =  new UserMapper();
		filter.setUserName("atwjsw");
		filter.setAge(46);
		filter.setEmail("daniel.wen@ericsson.com, daniel_wen@139.com, 13928882387@163.com");
		String sql = qb.query(filter);
		System.out.println("sql: " + sql);
	}
	
	@Test
	public void testQuery4() {
		QueryBuilder qb = new QueryBuilder();
		UserMapper2 filter2 =  new UserMapper2();
		filter2.setDeptName("Finance");
		filter2.setHeadcount(10);
		String sql = qb.query(filter2);
		System.out.println("sql: " + sql);
	}

}
