package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����ַ�������ķ�ʽ�ǰ����ַ��ı����С����
 * ��˳���������Ļ�����⡣
 * @author Administrator
 * 
 */
public class SortCollectionDemo2 {
	public static void main(String[] args) {
		List<String> list =
				new ArrayList<String>();
		
		list.add("����ʦ");
		list.add("����ʦ");
		list.add("С����ʦ");
		//�Զ���Ƚ���
		MyComparator comm = new MyComparator();
		System.out.println(list);
		/*
		 * �����ص�sort����Ҫ�����Ƕ���Ĵ���һ��
		 * �Ƚ����������ͻ����������⣺
		 * 1:Ԫ�������Ѿ�ʵ��Comparable�ӿڲ�����
		 * �˱ȽϹ��򣬵��Ǹù��������������������Ҫ��
		 * 2��Ԫ��û��ʵ��Comparable������Ҳ����Ҫ
		 * ǿ��Ԫ�ر���ʵ�ָýӿڣ����ٶԸ�Ԫ�ص����롣	
		 */
		Collections.sort(list,comm);
		System.out.println(list);
		/*
		 * ��������û�й���
		 */
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
