package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��Stringת��ΪDate
 * @author Administrator
 * 
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String str = "2008/08/08 20:08:08";
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss"
				);
		/**
		 * String-->Date
		 * Date parse(String str)
		 * ����SimpleDateFormatָ�������ڸ�ʽ
		 * �����������ַ���������ת��Ϊһ��Date
		 * ��������ʾ���ַ���������ʱ�䡣
		 */
		//2015-07-28
		Date date = sdf.parse(str);
		
		System.out.println(date);
	}
}
