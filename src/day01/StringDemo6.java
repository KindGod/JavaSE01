package day01;
//import java.lang.String;默认会导入
/**
 * String trim()
 * 去除当前字符串中两边的空白。
 * @author Administrator
 * 
 */
public class StringDemo6 {
	public static void main(String[] args) {
		String str = "  Hello		";
		String s = str.trim(); 
		System.out.println(s);//Hello
		System.out.println(str);//  Hello		
	}
}
