package day01;
/**
 * String substring(int start,int end)
 * 截取当前字符串的部分内容
 * 从start处开始，截取到end(但是不含有end对应的字符)
 * java api 有个特点，凡是使用两个数字表示范围时，
 * 通常都是"含头不含尾"的。
 * @author Administrator
 */
public class StringDemo4 {
	public static void main(String[] args) {
		//            01234567890123
		String str = "www.oracle.com";
		//截取
		String sub = str.substring(4,10);
		System.out.println(sub);
	}
}
