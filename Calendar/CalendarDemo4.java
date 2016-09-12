import java.util.Calendar;

/**
 * Calendar 提供了一个可以获取当前Calendar表示的
 * 时间中给定的时间分量所允许的最大值getActualMaximum()
 * @author Administrator
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar
		     = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR,2008);
		//今年一共多少天？
		int days = calendar.getActualMaximum(
				Calendar.DAY_OF_YEAR
						);
		System.out.println(days);
		//当前月底是几号?
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_MONTH
				);
		System.out.println(days);
	}
}
