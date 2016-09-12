package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类，用于操作时间的类
 * 本身是一个抽象类不能实例化
 * 常用的实现类是封装了格里高利历法的Calendar
 * Calendar提供了一个静态方法getInstance(),
 * 以方便我们获取一个适用的实现类的实例
 * 
 * @author Administrator
 * 
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		//实例化，默认表示当前系统时间
		Calendar calendar
		   = Calendar.getInstance();
		
		//实例化格里高利历法
//		calendar = new GregorianCalendar();
		System.out.println(calendar);
		
		/**
		 * Calendar-->Date
		 * Calendar提供了一个方法：
		 * Date getTime()
		 * 该方法可以将当前Calendar表示的时间
		 * 以Date形式返回。
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/**
		 * Date-->Calendar
		 * Calendar提供了另一个方法:
		 * void setTime(Date date)
		 * 该方法允许当前Calendar表示给定的Date
		 * 所表示的时间
		 */
//		calendar.setTime(date);
		/**
		 * 对于时间相关内容的学习，需要掌握：
		 * 1:Date,SimpleDateFormat,Calendar
		 * 各自的作用
		 * 2:String,Date,Calendar之间的转换
		 */
	}
}
