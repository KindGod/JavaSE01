package day02;

import java.util.Scanner;

/**
 * ��г����
 * @author Administrator
 * 
 */
public class StringDemo4 {
	public static void main(String[] args) {
		String regex = "(wqnmblgdsb|sb|cnm|cao|nc)";
		String message="wqnmlgdsb!����ô��ônc!cnm!";
		message = message.replaceAll(regex,"***");
		String abc = "(1|2|3|4|5|6|7|8|9|0)";
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = scan.nextLine();
		scan.close();
		abc = str.replaceAll(abc,"*");
		System.out.println(message);
		System.out.println(abc);
	}
}
