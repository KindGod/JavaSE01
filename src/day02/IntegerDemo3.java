package day02;
import java.lang.Integer;
/**
 * �������Ͱ�װ�඼֧����������
 * MAX_VALUE:��Ӧ�Ļ������͵����ȡֵ
 * MIN_VALUE:��Ӧ�Ļ������͵���Сȡֵ
 * @author Administrator
 * 
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		System.out.println(imax);
		System.out.println(imin);
		
		/*
		 * 01111111 11111111 11111111 11111111 int�������ֵ
		 * 10000000 00000000 00000000 00000000 int������Сֵ
		 * 11111111 11111111 11111111 11111111 int�������ֵ
		 */
		
		double dmax = Double.MAX_VALUE;
	}
}
