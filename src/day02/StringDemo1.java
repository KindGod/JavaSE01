package day02;

import java.util.Scanner;

/**
 * 字符串支持正则表达式的方法1：
 * boolean matches(String regex)
 *该方法用来使用给定的正则表达式验证当前字符串的
 *格式是否满足要求，满足则返回true
 *需要注意的是，无论给定的正则表达式中是否有^...$
 *都是做全匹配验证。
 *
 *@author Administrator
 */
public class StringDemo1 {
	public static void main(String[] args) {
		/*
		 * 验证邮箱的正则表达式
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String regex 
		="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		
//		String mail = "fancq@tarena.com.cn";
//		boolean t = mail.matches(regex); 
//		if(t){
//			System.out.println("是邮箱！");
//		}else{
//			System.out.println("不是邮箱！");
//		}
		System.out.println("请输入一个邮箱地址：");
		Scanner scan =new Scanner(System.in);
		
		while(true){
			String a = scan.nextLine();
			boolean f =a.matches(regex);
		if(f){
			System.out.println("是邮箱！");
			break;
		}else{
			System.out.println("不是邮箱！");
		}
		}
		scan.close();
	}
}
