package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 * @author Administrator
 * 
 */
public class SortCollectionDemo3 {
	public static void main(String[] args) {
		List<Point> list = 
				new ArrayList<Point>();
		list.add(new Point(3,4));
		list.add(new Point(1,5));
		list.add(new Point(7,8));
		list.add(new Point(2,4));
		
		System.out.println(list);
		/*
		 * 由于使用sort方法，要求我们集合中的元素
		 * 必须实现Comparable接口。为此该排序功能
		 * 对Point类具有侵入性。
		 * 侵入性：为了使用它提供的功能，需要对我们定义的
		 * 类有所改变。
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
