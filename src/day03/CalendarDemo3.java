package day03;

import java.util.Calendar;

/**
 * Calendar�ṩ��һ��get����
 * int get(int field)
 * �÷������Ի�ȡ��ǰCalendar�и�����ʱ�����
 * ��Ӧ��ֵ
 * @author Administrator
 * 
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar
		     = Calendar.getInstance();
		//��ȡ��
		int year = calendar.get(Calendar.YEAR);
		System.out.println("year:"+year);
		//��ȡ��
		int month = calendar.get(Calendar.MONTH);
		//��ȡ��
		int day = calendar.get(Calendar.DATE);
		//��ȡ���ڼ�
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"-"+(month+1)+"-"+day+"����"+dow);
		
		//�����ǽ���ĵڶ�����
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�"+doy+"��");
	}
}