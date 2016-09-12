package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 是一个接口，所有集合的顶级接口
 * 规定了所有集合都应具有的功能(方法)
 * 
 * 集合用来存放一组元素。并提供了维护集合的相关方法。
 * @author Administrator
 * 
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		/*
		 * java.util.ArrayList
		 */
		Collection c = new ArrayList();
		/*
		 * 集合提供了一个用于向集合中添加元素的
		 * 方法:
		 * boolean add(E e)
		 * 若成功添加则返回true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		System.out.println(c);
		/*
		 * int size()
		 * 该方法用来获取集合中的元素数量
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * 判断集合是否不含有任何元素
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		
		size = c.size();
		System.out.println("size:"+size);
		
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println(c);
	}
}
