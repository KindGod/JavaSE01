package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ��һ���ӿڣ����м��ϵĶ����ӿ�
 * �涨�����м��϶�Ӧ���еĹ���(����)
 * 
 * �����������һ��Ԫ�ء����ṩ��ά�����ϵ���ط�����
 * @author Administrator
 * 
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		/*
		 * java.util.ArrayList
		 */
		Collection c = new ArrayList();
		/*
		 * �����ṩ��һ�������򼯺������Ԫ�ص�
		 * ����:
		 * boolean add(E e)
		 * ���ɹ�����򷵻�true
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		
		System.out.println(c);
		/*
		 * int size()
		 * �÷���������ȡ�����е�Ԫ������
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * �жϼ����Ƿ񲻺����κ�Ԫ��
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * ��ռ���
		 */
		c.clear();
		
		size = c.size();
		System.out.println("size:"+size);
		
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println(c);
	}
}
