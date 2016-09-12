package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 * Collection提供了一个方法
 * Iterator iterator()
 * 该方法可以获取一个用来遍历当前集合的迭代器
 * 
 * 迭代器Iterator本身是一个接口,只定义了遍历集合
 * 的方法应该有哪些，但并没有具体实现。不同的集合
 * 都提供了用于遍历自身元素的迭代器实现类。
 * 
 * 遍历集合遵循的原则:
 * 问取删，其中删除元素不是必须操作。
 * @author Administrator
 * 
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		
		//获取用于遍历当前集合的迭代器
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * 问的过程，该方法会判断当前集合中是否
		 * 还有元素可以被取出，若有则返回true
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * 取的过程:该方法会将集合中下一个元素返回。
			 */
			Object obj = it.next();
			String str = (String)obj;
			System.out.println(str);
			/*
			 * 当我们需要判断一个变量与字面量
			 * 内容是否一样时，应当使用字面量
			 * 的equals方法去与变量比较，这
			 * 可以避免空指针的出现
			 * 
			 */
			if("#".equals(str)){
				c.remove(str);
				/*
				 * 使用迭代器遍历集合的过程中
				 * 不能通过集合的方法改变元素
				 * 数量，否则可能导致迭代器遍历
				 * 失败。我们可以通过迭代器提供的
				 * remove方法删除通过next方法
				 * 遍历出来的元素。
				 */
				it.remove();
			}
		}	
		System.out.println(c);
	}
}
