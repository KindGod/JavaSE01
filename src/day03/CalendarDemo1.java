package day03;

import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

/**
 * java.util.Calendar
 * �����࣬���ڲ���ʱ�����
 * ������һ�������಻��ʵ����
 * ���õ�ʵ�����Ƿ�װ�˸������������Calendar
 * Calendar�ṩ��һ����̬����getInstance(),
 * �Է������ǻ�ȡһ�����õ�ʵ�����ʵ��
 * 
 * @author Administrator
 * 
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		//ʵ������Ĭ�ϱ�ʾ��ǰϵͳʱ��
		Calendar calendar
		   = Calendar.getInstance();
		
		//ʵ���������������
//		calendar = new GregorianCalendar();
		System.out.println(calendar);
		
		/**
		 * Calendar-->Date
		 * Calendar�ṩ��һ��������
		 * Date getTime()
		 * �÷������Խ���ǰCalendar��ʾ��ʱ��
		 * ��Date��ʽ���ء�
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/**
		 * Date-->Calendar
		 * Calendar�ṩ����һ������:
		 * void setTime(Date date)
		 * �÷�������ǰCalendar��ʾ������Date
		 * ����ʾ��ʱ��
		 */
		calendar.setTime(date);
		/**
		 * ����ʱ��������ݵ�ѧϰ����Ҫ���գ�
		 * 1:Date,SimpleDateFormat,Calendar
		 * ���Ե�����
		 * 2:String,Date,Calendar֮���ת��
		 */
	}
}
