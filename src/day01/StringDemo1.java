package day01;
/**
 * 字符串是不变对象：字符串对象一旦创建，内容是不可改变的，要想改变内容一定会创建新对象。
 * 
 * 字符串若使用字面量形式创建对象，会重用以前创建过的内容相同的字符串对象。
 * 使用new关键字创建的字符串对象由于不会存入常量池也不会检查常量池，所以不会重用对象。
 * 
 * @author Administrator
 * 
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "Hello123";
		//字面量赋值会重用对象
		String s2 = "Hello123";
		//new创建则不会重用！
		String s3 = new String("Hello123");
		/*
		 * java编译器有一个优化措施，就是若计算
		 * 表达式运算符两边都是字面量，那么编译器
		 * 在生成class文件时就将结果计算完毕并保存
		 * 到编译后的class文件中了。
		 * 所以下面的代码在class文件里是：
		 * String s4 = "Hello123"; 
		 */
		String s4 = "Hello"+"123";
		
		String s5 = "Hello";
		String s6 = s5 + "123";
		
		String s7 = "Hello"+123;
		String s8 = "He" +'l'+"lo"+12+3;

		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);//false
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s1==s4);//ture
		System.out.println(s1==s6);//false
		System.out.println(s1==s7);//true
		System.out.println(s1==s8);//true
	}
}
