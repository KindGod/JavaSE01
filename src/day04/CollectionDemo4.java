package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合支持泛型，用来约束元素的类型
 * @author Administrator
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		/*
		 * 当使用String约束后，集合中只能存放
		 * String类型元素，并且获取也无需再次
		 * 造型。
		 */
		Collection<String> c
		    = new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		//其他类型不可以存入
		//c.add(13);
		
		/*
		 * 这里同样有泛型的漏洞
		 */
//		Collection c1 = c ;
//		c1.add(123);
		
		//获取时也无需再造型
		for(String str : c){
			System.out.println(str);
		}
		
		/*
		 * 迭代器也支持泛型，而泛型的实际类型应当
		 * 与其遍历的集合所指定的泛型类型一致
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
