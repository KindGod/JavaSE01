package day03;

import java.util.Calendar;

/**
 * Calendar �ṩ��һ�����Ի�ȡ��ǰCalendar��ʾ��
 * ʱ���и�����ʱ���������������ֵgetActualMaximum()
 * @author Administrator
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar
		     = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR,2008);
		//����һ�������죿
		int days = calendar.getActualMaximum(
				Calendar.DAY_OF_YEAR
						);
		System.out.println(days);
		//��ǰ�µ��Ǽ���?
		days = calendar.getActualMaximum(
				Calendar.DAY_OF_MONTH
				);
		System.out.println(days);
	}
}
