package day03;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * java.text.SimpleDateFormat
 * 该类的主要作用是根据一个给定的日期格式，
 * 将String和Date之间相互转换。
 * 学习该类需要记住两件事:
 * 1.会写日期格式
 * 2.记住两个转换方法
 * @author Administrator
 * 
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date now = new Date();
		/**
		 * Date自身提供的toString返回的
		 * 字符串对于非英语地区来讲不是十分
		 * 友好
		 */
		System.out.println(now);
		
		/**
		 * 希望显示的格式：
		 * 2015-07-22 10:51:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
		   = new SimpleDateFormat(
				   "yyyy-MM-dd HH:mm:ss"
				   );
		/**
		 * Date-->String
		 * String format(Date date)
		 * 该方法会将给定的Date表示的时间按照
		 * 当前SimpleDateFormat指定的日期
		 * 格式转换为字符串
		 */
		String str = sdf.format(now);
		System.out.println(str);
	}
}
