package day02;
import java.lang.Integer;
/**
 * 基本类型转换为包装类推荐的方式:
 * 使用静态方法valueOf()
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
		 * Integer使用valueOf会重用1字节整数的对象。
		 */
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
	}
}
