import java.util.Calendar;

/**
 * Calendar提供了一个get方法
 * int get(int field)
 * 该方法可以获取当前Calendar中给定的时间分量
 * 对应的值
 * @author Administrator
 * 
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar
		     = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		System.out.println("year:"+year);
		//获取月
		int month = calendar.get(Calendar.MONTH);
		//获取日
		int day = calendar.get(Calendar.DATE);
		//获取星期几
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"-"+(month+1)+"-"+day+"星期"+dow);
		
		//今年是今年的第多少天
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+doy+"天");
	}
}
