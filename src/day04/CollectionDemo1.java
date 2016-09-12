package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合提供了批量操作元素的方法
 * @author Administrator
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c1 = new HashSet();
		c1.add("java");
		c1.add("c++");
		c1.add("oc");
		
		Collection c2 = new ArrayList();
		c2.add("php");
		c2.add("c#");
		c2.add("java");
		/*
		 * Collection提供了一个批量添加的方法
		 * boolean addAll(Collection c)
		 * 将给定的集合中的所有元素添加到当前集合
		 * 中，当做完此操作后若当前集合元素发生了变化
		 * 则返回true
		 */
		c1.addAll(c2);
		System.out.println(c1);		
		
		Collection c3 = new ArrayList();
		c3.add("oc");
		c3.add("php");
		c3.add("vb");
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 * 若都包含则返回true
		 */
		boolean tf = c1.containsAll(c3);
		System.out.println("全包含:"+tf);
	}
}
