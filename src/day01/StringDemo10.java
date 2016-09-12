package day01;
/**
 * 将一个字符串中的英文部分转换为全大写或全小写
 * String toUpperCase()
 * String toLowerCase()
 * 
 * @author Administrator
 * 
 */
public class StringDemo10 {
	public static void main(String[] args) {
		String str = "Hello你好！";
		
		String upper = str.toUpperCase();
		System.out.println(upper);
		
		String lower = str.toLowerCase();
		System.out.println(lower);
		/*
		 * 这两个方法常被用来忽略大小写使用
		 * 对中文无效 
		 */
	}
}
