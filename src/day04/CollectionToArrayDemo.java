package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ṩ��һ������toArray()
 * ���Խ����еļ���ת��Ϊ����
 * @author Administrator
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c
		    = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		//Object[] array = c.toArray();
		
		/*
		 * toArray()����Ҫ�����Ǵ���һ��Ҫת��
		 * �����飬�����뼯�ϵ�sizeһ�¼��ɡ�
		 * ����һ�£�toArray()���жϵ�ǰ�����Ƿ�
		 * ���Ա�����¼����е�����Ԫ�أ����Ծ�����
		 * ������飬�����ԣ��򴴽�һ�������������
		 * ͬ���͵����鲢������Ԫ�ش���󷵻ء�
		 */
		String[] array
		     =c.toArray(new String[c.size()]);
		System.out.println(
				Arrays.toString(array)
		);
	}
}
