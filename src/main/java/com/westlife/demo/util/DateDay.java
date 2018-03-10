package com.westlife.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 *
 * 
 * 计算来到世界多少天 
 *  
 *
 */

public class DateDay {

	public static String day(String birthday) throws ParseException {

		// 把字符串转换为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		// 解析这个年月日
		Date d = sdf.parse(birthday);

		// 通过这个日期得到一个毫秒值
		long mytime = d.getTime();

		// 获取当前毫秒值
		long nowtime = System.currentTimeMillis();

		// 用减法计算相差的毫秒值
		long time = nowtime - mytime;
		long day = time / 1000 / 60 / 60 / 24;
		//System.out.println("你来到这个世界：" + day + "天");
		return String.valueOf(day);

	}
	public static String millisecond(String birthday) throws ParseException {

		// 把字符串转换为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		// 解析这个年月日
		Date d = sdf.parse(birthday);

		// 通过这个日期得到一个毫秒值
		long mytime = d.getTime();

		// 获取当前毫秒值
		long nowtime = System.currentTimeMillis();

		// 用减法计算相差的毫秒值
		long time = nowtime - mytime;
		
		//System.out.println("你来到这个世界：" + time + "毫秒");
		return String.valueOf(time);

	}

}
