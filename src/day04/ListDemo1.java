package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List
 * ��һ���ӿڣ���������Collection�ӿ�
 * �ü��ϵ��ص���:Ԫ�ؿ��ظ������������������±����ʽ
 * ��������Ԫ�ء�
 * @author Administrator
 * 
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list
		    =new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		//[one,two,three]
		System.out.println(list);
		
		/*
		 * E get(int i)
		 * ��ȡָ���±��Ӧ��Ԫ��
		 */
		String str = list.get(2);
		System.out.println(str);
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		/*
		 * E set(int index,E e)
		 * ��������Ԫ�����õ�ָ����λ���ϣ�����ֵΪ
		 * ԭλ���ϵ�Ԫ�ء�
		 */
		//[one,two,three]
		list.set(1,"2");
		System.out.println(list);
		
		//[one,2,three]
		String old = list.set(2,"3");//���ĳ����±�Խ��
		System.out.println(list);
		System.out.println("old:"+old);
	}
}
