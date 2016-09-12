package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 插入与删除操作
 * List集合提供了一对额外的add,remove方法
 * 允许我们通过下表操作
 * @author Administrator
 * 
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list 
		    = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		/*
		 * void add(int index,E e)
		 * 将给定的元素插入到给定的位置，原位置及
		 * 后续元素顺序向后移动
		 */
		//[one,2,two,three]
		list.add(3,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * 将给定下标对应的元素删除，并将其返回
		 */
		//[one,2,three]
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}
