package day01;
/**
 * String提供了一组静态方法valueOf()
 * 该方法有若干的重载。用来将其他类型数据转换为字符串。
 * 常用的是将基本类型转换为字符串
 * 
 * @author Administrator
 */
public class StringDemo11 {
	public static void main(String[] args){
		
		String istr = String.valueOf(123);
		System.out.println(istr);
		
		String dstr = String.valueOf(123.123);
		System.out.println(dstr+"4");
		
		String str = 123 +"";//这种方法也可以转成字符串
		System.out.println(str);
	}
}
