package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ϴ�ŵ���Ԫ�ص�����(��ַ)
 * @author Administrator
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new  ArrayList();
		Emp emp = new Emp("����",22,"��",5000);
		
		c.add(emp);
		
		System.out.println(c);
		
		emp.setName("����");
		
		System.out.println(c);
	}
}
