package day02;

import java.util.Scanner;

/**
 * 和谐用语
 * @author Administrator
 * 
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String regex = "(wqnmblgdsb|sb|cnm|cao|nc)";
		String message="wqnmlgdsb!你怎么这么nc!cnm!";
		message = message.replaceAll(regex,"***");
		String abc = "(1|2|3|4|5|6|7|8|9|0)";
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = scan.nextLine();
		scan.close();
		abc = str.replaceAll(abc,"*");
		System.out.println(message);
		System.out.println(abc);
	}
}
