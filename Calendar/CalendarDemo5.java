import java.util.Calendar;

/**
 * Calendar提供了一个可以计算时间的方法
 * void add(int field,int value)
 * 是当前Calendar加上给定的时间分量对应的值
 * 计算后可能会影响其他时间分量的值，会自动对应好。
 * 例如，加了几天后，星期就会跟着变。若跨月了，月
 * 也会跟着变等等。
 * @author Administrator
 * 
 */
public class CalendarDemo5 {
	public static void main(String[] args) {
		Calendar calendar
		      = Calendar.getInstance();
		//五天后是哪天?
		calendar.add(Calendar.DAY_OF_YEAR,5);
		System.out.println(calendar.getTime());
		
		//再加上两个月?
		calendar.add(Calendar.MONTH,2);
		System.out.println(calendar.getTime());
		
		//一年前的这一天?
		calendar.add(Calendar.YEAR,-1);
		System.out.println(calendar.getTime());	
	}
}
