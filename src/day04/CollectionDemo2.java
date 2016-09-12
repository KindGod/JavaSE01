package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合中的元素
 * @author Administrator
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Emp("张三",25,"男",5000));
		c.add(new Emp("李四",26,"女",6000));
		c.add(new Emp("王五",27,"男",7000));
		
		Emp emp = new Emp("张三",25,"男",5000);
		System.out.println(c);
		/*
		 * boolean remove(E e)
		 * 将集合中第一个与给定元素equals比较为
		 * true的元素删除
		 * 若成功删除元素返回true,否则返回false
		 */
		c.remove(emp);
		System.out.println(c);
		
		c.removeAll(c);
	}
}
