package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个方法toArray()
 * 可以将现有的集合转换为数组
 * @author Administrator
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c
		    = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		//Object[] array = c.toArray();
		
		/*
		 * toArray()方法要求我们传入一个要转换
		 * 的数组，长度与集合的size一致即可。
		 * 若不一致，toArray()会判断当前数组是否
		 * 可以保存的下集合中的所有元素，可以就是用
		 * 这个数组，不可以，则创建一个与给定的数组
		 * 同类型的数组并将集合元素存入后返回。
		 */
		String[] array
		     =c.toArray(new String[c.size()]);
		System.out.println(
				Arrays.toString(array)
		);
	}
}
