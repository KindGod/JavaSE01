package day02;

import java.lang.Integer;
/**
 * ��װ�඼֧��һ����̬���� parseXXX(String str)
 * ���Խ��ַ���ת��Ϊ��Ӧ�Ļ�������
 * ǰ���ǣ����ַ������������ݱ����ǻ����������ݵ�����
 * @author Administrator
 * 
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		String str = "123";
		int i = Integer.parseInt(str);
		double d = Double.parseDouble(str);
		System.out.println(i+1);
	}
}
