package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ�������е�Ԫ��
 * @author Administrator
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Emp("����",25,"��",5000));
		c.add(new Emp("����",26,"Ů",6000));
		c.add(new Emp("����",27,"��",7000));
		
		Emp emp = new Emp("����",25,"��",5000);
		System.out.println(c);
		/*
		 * boolean remove(E e)
		 * �������е�һ�������Ԫ��equals�Ƚ�Ϊ
		 * true��Ԫ��ɾ��
		 * ���ɹ�ɾ��Ԫ�ط���true,���򷵻�false
		 */
		c.remove(emp);
		System.out.println(c);
		
		c.removeAll(c);
	}
}
