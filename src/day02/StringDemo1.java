package day02;

import java.util.Scanner;

/**
 * �ַ���֧��������ʽ�ķ���1��
 * boolean matches(String regex)
 *�÷�������ʹ�ø�����������ʽ��֤��ǰ�ַ�����
 *��ʽ�Ƿ�����Ҫ�������򷵻�true
 *��Ҫע����ǣ����۸�����������ʽ���Ƿ���^...$
 *������ȫƥ����֤��
 *
 *@author Administrator
 */
public class StringDemo1 {
	public static void main(String[] args) {
		/*
		 * ��֤�����������ʽ
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String regex 
		="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		
//		String mail = "fancq@tarena.com.cn";
//		boolean t = mail.matches(regex); 
//		if(t){
//			System.out.println("�����䣡");
//		}else{
//			System.out.println("�������䣡");
//		}
		System.out.println("������һ�������ַ��");
		Scanner scan =new Scanner(System.in);
		
		while(true){
			String a = scan.nextLine();
			boolean f =a.matches(regex);
		if(f){
			System.out.println("�����䣡");
			break;
		}else{
			System.out.println("�������䣡");
		}
		}
		scan.close();
	}
}
