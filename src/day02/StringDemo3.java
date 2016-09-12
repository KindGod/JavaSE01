package day02;
/**
 * String replaceAll(
 *    String regex,String replacement
 * )
 * 该方法会将当前字符串中满足正则表达式的部分替换为
 * 给定的字符串。
 * 
 * @author Administrator
 */
public class StringDemo3 {
	public static void main(String []args){
		String str = "dsad687fdsf7675fsdf90";
		/*
		 * 将数字部分替换为"#NUMBER"
		 */
		str = str.replaceAll("[0-9]+","#NUMBER");
		System.out.println(str);
	}
}
