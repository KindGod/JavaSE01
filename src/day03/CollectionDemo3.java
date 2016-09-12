package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存放的是元素的引用(地址)
 * @author Administrator
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new  ArrayList();
		Emp emp = new Emp("张三",22,"男",5000);
		
		c.add(emp);
		
		System.out.println(c);
		
		emp.setName("李四");
		
		System.out.println(c);
	}
}
