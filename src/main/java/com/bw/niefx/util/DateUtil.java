package com.bw.niefx.util;

import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: X
 * @date: 2020年4月23日 下午6:15:10
 */
public class DateUtil {
	
	public static Date random(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		long t = (long) (Math.random()*(t2-t1)+t1);
		return new Date(t);
	}
	
}
