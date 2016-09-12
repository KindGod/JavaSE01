package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 从String转换为Date
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
		 * 根据SimpleDateFormat指定的日期格式
		 * 解析给定的字符串，将其转换为一个Date
		 * 对象来表示该字符串描述的时间。
		 */
		//2015-07-28
		Date date = sdf.parse(str);
		
		System.out.println(date);
	}
}
