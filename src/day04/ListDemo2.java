package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ɾ������
 * List�����ṩ��һ�Զ����add,remove����
 * ��������ͨ���±����
 * @author Administrator
 * 
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list 
		    = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		/*
		 * void add(int index,E e)
		 * ��������Ԫ�ز��뵽������λ�ã�ԭλ�ü�
		 * ����Ԫ��˳������ƶ�
		 */
		//[one,2,two,three]
		list.add(3,"2");
		System.out.println(list);
		
		/*
		 * E remove(int index)
		 * �������±��Ӧ��Ԫ��ɾ���������䷵��
		 */
		//[one,2,three]
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}
