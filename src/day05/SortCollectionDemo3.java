package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author Administrator
 * 
 */
public class SortCollectionDemo3 {
	public static void main(String[] args) {
		List<Point> list = 
				new ArrayList<Point>();
		list.add(new Point(3,4));
		list.add(new Point(1,5));
		list.add(new Point(7,8));
		list.add(new Point(2,4));
		
		System.out.println(list);
		/*
		 * ����ʹ��sort������Ҫ�����Ǽ����е�Ԫ��
		 * ����ʵ��Comparable�ӿڡ�Ϊ�˸�������
		 * ��Point����������ԡ�
		 * �����ԣ�Ϊ��ʹ�����ṩ�Ĺ��ܣ���Ҫ�����Ƕ����
		 * �������ı䡣
		 */
		Collections.sort(list);
		System.out.println(list);
	}
}
