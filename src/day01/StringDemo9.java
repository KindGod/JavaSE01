package day01;
/**
 * boolean stratsWith(String str)
 * boolean endsWith(String str)
 * @author Administrator
 *
 * 这两个方法一个是用来判断当前字符串是否是以给定的字符串起始的，
 * 另一个是判断当前字符串是否以给定的字符串结尾的。
 * 
 */
public class StringDemo9 {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("th");
		System.out.println("starts:"+ starts);
		
		boolean ends= str.endsWith("va");
		System.out.println("ends:" + ends);
	}
}
