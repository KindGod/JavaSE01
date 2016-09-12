package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * 是一个接口，并集成了Collection接口
 * 该集合的特点是:元素可重复，并且有序。允许以下标的形式
 * 操作数组元素。
 * @author Administrator
 * 
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list
		    =new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		//[one,two,three]
		System.out.println(list);
		
		/*
		 * E get(int i)
		 * 获取指定下标对应的元素
		 */
		String str = list.get(2);
		System.out.println(str);
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int index,E e)
		 * 将给定的元素设置到指定的位置上，返回值为
		 * 原位置上的元素。
		 */
		//[one,two,three]
		list.set(1,"2");
		System.out.println(list);
		
		//[one,2,three]
		String old = list.set(2,"3");//当心出现下标越界
		System.out.println(list);
		System.out.println("old:"+old);
	}
}
