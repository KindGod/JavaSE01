package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用新循环遍历集合
 * @author Administrator
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		/*
		 * 新循环在遍历集合时要注意。新循环本身
		 * 不是新的语法，JVM并不认可。而是编译器
		 * 认可的。它会将新循环改成迭代器后在生成
		 * class文件。所以，使用新循环遍历集合的
		 * 过程中同样不能使用集合的方法改变元素数量
		 */
		for(Object o:c){
			String str =(String)  o;
			System.out.println(str);
//			if("#".equals(str)){ 为什么？
//				c.remove(str);
//			}
		}
	}
}
