package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ʹ����ѭ����������
 * @author Administrator
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		/*
		 * ��ѭ���ڱ�������ʱҪע�⡣��ѭ������
		 * �����µ��﷨��JVM�����Ͽɡ����Ǳ�����
		 * �Ͽɵġ����Ὣ��ѭ���ĳɵ�������������
		 * class�ļ������ԣ�ʹ����ѭ���������ϵ�
		 * ������ͬ������ʹ�ü��ϵķ����ı�Ԫ������
		 */
		for(Object o:c){
			String str =(String)  o;
			System.out.println(str);
//			if("#".equals(str)){ Ϊʲô��
//				c.remove(str);
//			}
		}
	}
}
