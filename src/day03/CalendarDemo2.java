package day03;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//Ĭ��Ϊ��ǰϵͳʱ��
		Calendar calendar
		       = Calendar.getInstance();
		//ϣ����ʾ2008-08-08 20:08:08
		/*
		 * void set(int field,int value)
		 * ��������ʱ���������Ϊ������ֵ
		 */
		//������
		calendar.set(Calendar.YEAR,2008);
		//������
		/*
		 * �·ݴ�0��ʼ��0��ʾ1�¡���
		 *Ҳ����ʹ��Calendar�ṩ�ĳ���
		 */
		calendar.set(Calendar.MONTH,7);
		calendar.set(Calendar.DAY_OF_MONTH,8);
		/*
		 * �͡��ա���ص�ʱ�����
		 * DATE: ����ȼ���DAY_OF_MONTH int - Calendar
		 * DAY_OF_MONTH:���е��죬�׳Ƽ���  int - Calendar
		 * DAY_OF_WEEK:�����е��죬�ܼ�  int - Calendar
		 * DAY_OF_WEEK_IN_MONTH:���е��졣int - Calendar
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
