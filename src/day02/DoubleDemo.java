package day02;

public class DoubleDemo {

	public static void main(String[] args) {
		//将基本类型转换为引用类型
		Double d = new Double(1.2);
		/*
		 * Number提供的转换基本类型的方法
		 * int intValue()
		 * 转换为int值
		 * 
		 * double doubleValue()
		 * 转换为double值
		 * 
		 * ...其余4个也是类似的。
		 */
		int i = d.intValue();
		System.out.println(i);
		
	}
}
