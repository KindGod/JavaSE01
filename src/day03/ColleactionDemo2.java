package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �ж�һ�������Ƿ����������Ԫ��
 * boolean contains(E e)
 * ����ǰ���ϰ���������Ԫ���򷵻�true
 * @author Administrator
 */
public class ColleactionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(new Emp("����",22,"��",5000));
		c.add(new Emp("����",21,"Ů",5600));
		c.add(new Emp("����",32,"��",6600));
		/*
		 * ����toString�ĸ�ʽ
		 * [Ԫ��1.toString(),Ԫ��2.toString()]
		 */
		System.out.println(c);
		
		Emp emp = new Emp("����",22,"��",5000);
		/*
		 * �����жϸ���Ԫ���Ƿ񱻰����Ǹ��ݸ�����Ԫ��
		 * �뼯���е�Ԫ���Ƿ���equals�Ƚ�Ϊtrue��
		 * �����ǿ����Ԫ���Ƿ�����ڼ�����
		 */
		boolean contains = c.contains(emp);
		System.out.println("����:"+contains);
	}
}
