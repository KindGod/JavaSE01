package day01;
/**
 * StrngBuilder内部维护了一个可变的字符数组
 * 从而保证了无论修改多少次字符串内容，都是在这个数组中完成。
 * 当然，若数组内容被超出，会扩容，但是与字符串的修改比较，
 * 内存上的消耗是明显的。
 * 其提供了用于修改字符串内容的常用修改方法：
 * 增：append
 * 删：delete
 * 改：replace
 * 插：insert
 * @author Administrator
 * 
 */
public class StringBuilderDemo {
	public static void main(String []args){
		String str = "努力学习java";
		/*
		 * 若想修改字符串，可以现将其变换为一个
		 * StringBuilder
		 */
		StringBuilder builder
				=new StringBuilder(str);
		
		//努力学习java，为了找个好工作
		builder.append("，为了找个好工作");
		
		//获取StringBuilder内部表示的字符串
		str = builder.toString();
		System.out.println(str);
		
		//努力学习java，就是为了改变世界
		builder.replace(9, 16, "就是为了改变世界！");
		System.out.println(builder.toString());
		
		//,就是为了改变世界！
		builder.delete(0,8);
		System.out.println(builder.toString());
		
		//活着，就是为了改变世界
		builder.insert(0, "活着");
		System.out.println(builder.toString());
		
		//活着，就是为了更好地改变世界
		builder.insert(7,"更好地");
		System.out.println(builder.toString());
		
		//翻转字符串
		builder.reverse();
		System.out.println(builder.toString());
	}

}
