package com.westlife.demo.util;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @ClassName: ConcurrentDateUtil
 * @Description: 日期多线程优化实现工具
 * @author westlife
 * @date 2017年8月26日
 *
 */
public class ConcurrentDateUtil {
	
	private ConcurrentDateUtil(){
		
	}

	private static ThreadLocal<DateFormat> threadLocalDateTime = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMddHHmmss");
		}
	};

	private static ThreadLocal<DateFormat> threadLocalDateTimeFormat = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
	};

	private static ThreadLocal<DateFormat> threadLocalDate = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}
	};

	private static ThreadLocal<DateFormat> threadLocalYYYYMMDD = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalYYYYMM = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyyMM");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalYYYY = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalMonth = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("MM");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalDay = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("dd");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalHour = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("HH");
		}
	};
	private static ThreadLocal<DateFormat> threadLocalMinute = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("mm");
		}
	};

	public static Date parseDateTimeFormat(String dateStr) throws ParseException {
		return threadLocalDateTimeFormat.get().parse(dateStr);
	}

	public static String formatDateTimeFormat(Date date) {
		return threadLocalDateTimeFormat.get().format(date);
	}

	public static Date parseDateTime(String dateStr) throws ParseException {
		return threadLocalDateTime.get().parse(dateStr);
	}

	public static String formatDateTime(Date date) {
		return threadLocalDateTime.get().format(date);
	}
	
	public static Date parseDate(String dateStr) throws ParseException {
		return threadLocalDate.get().parse(dateStr);
	}

	public static String formatDate(Date date) {
		return threadLocalDate.get().format(date);
	}

	public static Date parseDateYYYYMMDD(String dateStr) throws ParseException {
		return threadLocalYYYYMMDD.get().parse(dateStr);
	}

	public static String formatDateYYYYMMDD(Date date) {
		return threadLocalYYYYMMDD.get().format(date);
	}
	

	public static Date parseDateYYYYMM(String dateStr) throws ParseException {
		return threadLocalYYYYMM.get().parse(dateStr);
	}

	public static String formatDateYYYYMM(Date date) {
		return threadLocalYYYYMM.get().format(date);
	}
	

	public static Date parseDateYYYY(String dateStr) throws ParseException {
		return threadLocalYYYY.get().parse(dateStr);
	}

	public static String formatDateYYYY(Date date) {
		return threadLocalYYYY.get().format(date);
	}

	public static Date parseDateMonth(String dateStr) throws ParseException {
		return threadLocalMonth.get().parse(dateStr);
	}

	public static String formatDateMonth(Date date) {
		return threadLocalMonth.get().format(date);
	}
	
	public static Date parseDateDay(String dateStr) throws ParseException {
		return threadLocalDay.get().parse(dateStr);
	}

	public static String formatDateDay(Date date) {
		return threadLocalDay.get().format(date);
	}

	public static Date parseDateHour(String dateStr) throws ParseException {
		return threadLocalHour.get().parse(dateStr);
	}

	public static String formatDateHour(Date date) {
		return threadLocalHour.get().format(date);
	}

	public static Date parseDateMinute(String dateStr) throws ParseException {
		return threadLocalMinute.get().parse(dateStr);
	}

	public static String formatDateMinute(Date date) {
		return threadLocalMinute.get().format(date);
	}
}
