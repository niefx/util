package com.bw.niefx.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: X
 * @date: 2020年4月23日 下午6:15:10
 */
public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getInitMonth(Date src){
		//Calendar 是一个日期类，提供设置日期，加减日期的方法
		Calendar c =Calendar.getInstance();
		//放入传入的日期
		c.setTime(src);
		//设置这个月月初：把日期换为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);//天为1
		c.set(Calendar.HOUR_OF_DAY, 0);//小时为0
		c.set(Calendar.MINUTE, 0);//分钟为0
		c.set(Calendar.SECOND, 0);//设置秒数为0
		return c.getTime();
	}
	
	
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getEndMonth(Date src){
		//Calendar 是一个日期类，提供设置日期，加减日期的方法
		Calendar c =Calendar.getInstance();
		c.setTime(src);
		//月+1  2020-05-24  在变成月初2020-05-01 再减去一秒获取日期
		c.add(Calendar.MONTH, 1);//月+1  2020-05-24
		//变成月初2020-05-01
		Date nextMonthInit = getInitMonth(c.getTime());
		
		c.setTime(nextMonthInit);
		//减去1秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
	
	public static Date random(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		long t = (long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
	
	
	
	
	
	
}
