package day03;

import java.util.Calendar;

/**
 * Calendar�ṩ��һ�����Լ���ʱ��ķ���
 * void add(int field,int value)
 * �ǵ�ǰCalendar���ϸ�����ʱ�������Ӧ��ֵ
 * �������ܻ�Ӱ������ʱ�������ֵ�����Զ���Ӧ�á�
 * ���磬���˼�������ھͻ���ű䡣�������ˣ���
 * Ҳ����ű�ȵȡ�
 * @author Administrator
 * 
 */
public class CalendarDemo5 {
	public static void main(String[] args) {
		Calendar calendar
		      = Calendar.getInstance();
		//�����������?
		calendar.add(Calendar.DAY_OF_YEAR,5);
		System.out.println(calendar.getTime());
		
		//�ټ���������?
		calendar.add(Calendar.MONTH,2);
		System.out.println(calendar.getTime());
		
		//һ��ǰ����һ��?
		calendar.add(Calendar.YEAR,-1);
		System.out.println(calendar.getTime());	
	}
}
