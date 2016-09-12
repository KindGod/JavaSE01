package day03;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//默认为当前系统时间
		Calendar calendar
		       = Calendar.getInstance();
		//希望表示2008-08-08 20:08:08
		/*
		 * void set(int field,int value)
		 * 将给定的时间分量设置为给定的值
		 */
		//设置年
		calendar.set(Calendar.YEAR,2008);
		//设置月
		/*
		 * 月份从0开始，0表示1月。。
		 *也可以使用Calendar提供的常量
		 */
		calendar.set(Calendar.MONTH,7);
		calendar.set(Calendar.DAY_OF_MONTH,8);
		/*
		 * 和“日”相关的时间分量
		 * DATE: 这个等价于DAY_OF_MONTH int - Calendar
		 * DAY_OF_MONTH:月中的天，俗称几号  int - Calendar
		 * DAY_OF_WEEK:星期中的天，周几  int - Calendar
		 * DAY_OF_WEEK_IN_MONTH:年中的天。int - Calendar
		 * DAY_OF_YEAR:int - Calendar
		 */
		calendar.set(Calendar.HOUR,20);
		
		calendar.set(Calendar.MINUTE,8);
		
		calendar.set(Calendar.SECOND,8);
		
		calendar.set(Calendar.DAY_OF_WEEK,1);
		System.out.println(
				calendar.getTime()
		);
	}
}
