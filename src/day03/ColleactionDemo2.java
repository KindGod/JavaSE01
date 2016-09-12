package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 判断一个集合是否包含给定的元素
 * boolean contains(E e)
 * 若当前集合包含给定的元素则返回true
 * @author Administrator
 */
public class ColleactionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(new Emp("张三",22,"男",5000));
		c.add(new Emp("李四",21,"女",5600));
		c.add(new Emp("王五",32,"男",6600));
		/*
		 * 集合toString的格式
		 * [元素1.toString(),元素2.toString()]
		 */
		System.out.println(c);
		
		Emp emp = new Emp("张三",22,"男",5000);
		/*
		 * 集合判断给定元素是否被包含是根据给定的元素
		 * 与集合中的元素是否有equals比较为true的
		 * 而不是看这个元素是否必须在集合中
		 */
		boolean contains = c.contains(emp);
		System.out.println("包含:"+contains);
	}
}
