package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 由于字符串排序的方式是按照字符的编码从小到大
 * 的顺序。排列中文会出问题。
 * @author Administrator
 * 
 */
public class SortCollectionDemo2 {
	public static void main(String[] args) {
		List<String> list =
				new ArrayList<String>();
		
		list.add("苍老师");
		list.add("范老师");
		list.add("小泽老师");
		//自定义比较器
		MyComparator comm = new MyComparator();
		System.out.println(list);
		/*
		 * 该重载的sort方法要求我们额外的传入一个
		 * 比较器，这样就会解决两个问题：
		 * 1:元素自身已经实现Comparable接口并定义
		 * 了比较规则，但是该规则不能满足我们排序的需要。
		 * 2：元素没有实现Comparable，这里也不需要
		 * 强制元素必须实现该接口，减少对该元素的侵入。	
		 */
		Collections.sort(list,comm);
		System.out.println(list);
		/*
		 * 排序中文没有规律
		 */
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
