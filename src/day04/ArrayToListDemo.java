package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 需要注意的是，只能转换为List集合
 * 转换需要是用到数组的工具类Arrays
 * 其定义了一个静态方法:asList()
 * @author Administrator
 * 
 */

//Java中有哪些集合？
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = new String[]{"one","two","three"};
		
		List<String> list 
		    = Arrays.asList(array);
		
		System.out.println(list);
		/*
		 * 数组转换回来的集合，不能添加新元素
		 * 原因在于对该集合的操作就是对数组
		 * 操作。
		 */
//		list.add("four");
		//替换了集合元素就是替换了数组对应的元素
		list.set(0,"1");
		
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		/*
		 * 若想对集合元素进行增删这样的操作
		 * 需要自己创建一个新集合
		 */
		
		
	/*创建集合的同时将给定的集合中所有元素存入
	 * List<String> list1
	 *    =new ArrayList<String>(list);
	 *    System.out.println(list1);
	 *    list1.add("four");
	 *    System.out.println(list1);
	 */
		
		List<String> list1
		      =new ArrayList<String>();
		list1.addAll(list);
		System.out.println(list1);
		list1.add("four");
		System.out.println(list1);
	}
}
