package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ��Ҫע����ǣ�ֻ��ת��ΪList����
 * ת����Ҫ���õ�����Ĺ�����Arrays
 * �䶨����һ����̬����:asList()
 * @author Administrator
 * 
 */

//Java������Щ���ϣ�
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = new String[]{"one","two","three"};
		
		List<String> list 
		    = Arrays.asList(array);
		
		System.out.println(list);
		/*
		 * ����ת�������ļ��ϣ����������Ԫ��
		 * ԭ�����ڶԸü��ϵĲ������Ƕ�����
		 * ������
		 */
//		list.add("four");
		//�滻�˼���Ԫ�ؾ����滻�������Ӧ��Ԫ��
		list.set(0,"1");
		
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
		/*
		 * ����Լ���Ԫ�ؽ�����ɾ�����Ĳ���
		 * ��Ҫ�Լ�����һ���¼���
		 */
		
		
	/*�������ϵ�ͬʱ�������ļ���������Ԫ�ش���
	 * List<String> list1
	 *    =new ArrayList<String>(list);
	 *    System.out.println(list1);
	 *    list1.add("four");
	 *    System.out.println(list1);
	 */
		
		List<String> list1
		      =new ArrayList<String>();
		list1.addAll(list);
		System.out.println(list1);
		list1.add("four");
		System.out.println(list1);
	}
}
