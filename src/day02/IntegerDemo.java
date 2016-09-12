package day02;

/**
 * 包装类
 * 为了解决基本类型数据不能参加面向对象开发这个问题
 * 
 * 其中6个数字类型的包装类都继承自Number
 * Number是一个抽象类，提供了可以将数字在不同类型间
 * 互相转换的方法，但是通常都是短类型向长类型转换
 * 例如:short->int
 * int->short也可以，但是由于short长度小，转出来的
 * 数字可能不正确。
 * @author Administrator
 * 
 */
import java.util.Date;

public class IntegerDemo {
	public static void main(String[] args) {
		dosome("asd");
		dosome(new Date());
		int i = 1;
		Integer inte = new Integer(i);
		i = inte.intValue();
		dosome(inte);
	}
	
	public static void dosome(Object obj){
		
	}
}
class Integer{
	private int i;
	public Integer(int i){
		this.i = i ;
	}
	
	public int intValue(){
		return i ;
	}
}
