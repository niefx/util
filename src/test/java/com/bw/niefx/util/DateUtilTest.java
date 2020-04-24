package com.bw.niefx.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date date = DateUtil.getInitMonth(new Date());
		
		SimpleDateFormat fomat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String fo = fomat.format(date);
		System.out.println(fo);
	}

	@Test
	public void testGetDateByFullMonth() {
		Date date = DateUtil.getEndMonth(new Date());
		
		SimpleDateFormat fomat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String fo = fomat.format(date);
		System.out.println(fo);
		
		
	}

	@Test
	public void testRandom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSql() {
		String sql="select * from order where create>='{1}' and create<='{2}' ";
		
		Date initDate = DateUtil.getInitMonth(new Date());
		Date initDate1 = DateUtil.getEndMonth(new Date());
		SimpleDateFormat fomat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d1 = fomat.format(initDate);
		String d2 = fomat.format(initDate1);
		String sqlNew = sql.replace("{1}", d1).replace("{2}", d2);
		
		System.out.println(sqlNew);
	}
	
}
