package day02;
import java.lang.Integer;
/**
 * ��������ת��Ϊ��װ���Ƽ��ķ�ʽ:
 * ʹ�þ�̬����valueOf()
 * 
 * @author Administrator
 * 
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Integer i3 = Integer.valueOf(128);
		Integer i4 = Integer.valueOf(128);
		/*
		 * Integerʹ��valueOf������1�ֽ������Ķ���
		 */
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
	}
}
