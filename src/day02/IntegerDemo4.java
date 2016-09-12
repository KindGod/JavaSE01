package day02;

import java.lang.Integer;
/**
 * 包装类都支持一个静态方法 parseXXX(String str)
 * 可以将字符串转换为对应的基本类型
 * 前提是，该字符串描述的内容必须是基本类型数据的样子
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
