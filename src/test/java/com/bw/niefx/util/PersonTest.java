package com.bw.niefx.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for(int i=0;i<100;i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			
			p.setAge(RandomUtil.random(1, 120));
			
			p.setAbout(StringUtil.randomChineseString(10));
			
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			p.setCreated(DateUtil.random(c.getTime(), new Date()));
			System.out.println(i+":"+p);
		}
		
		
	}

}
