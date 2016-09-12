package day03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 要求用户输入自己的生日：1992-10-21
 * 经过计算，输出：
 * 到今天为止已经活了多少天了。
 * "恭喜你，已经活了8567天，请继续保持哦！"
 * 
 * @author Administrator
 * 
 */
public class SimpleDateFormatDemo3 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的生日：(yyyy-MM-dd)");
		String str = scanner.nextLine();
		scanner.close();
		SimpleDateFormat sdf 
		    = new SimpleDateFormat("yyyy-MM-dd");
		//生日
		Date birth = sdf.parse(str);
		//当前时间
		Date now = new Date();
		
		long time = now.getTime()-birth.getTime();
		time = time/1000/60/60/24 ;
		System.out.println("恭喜你，已经活了"+time+"天，请继续保持哦！");
	}
}
