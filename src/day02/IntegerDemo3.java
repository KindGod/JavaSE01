package day02;
import java.lang.Integer;
/**
 * 数字类型包装类都支持两个常量
 * MAX_VALUE:对应的基本类型的最大取值
 * MIN_VALUE:对应的基本类型的最小取值
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
		 * 01111111 11111111 11111111 11111111 int正数最大值
		 * 10000000 00000000 00000000 00000000 int负数最小值
		 * 11111111 11111111 11111111 11111111 int负数最大值
		 */
		
		double dmax = Double.MAX_VALUE;
	}
}
