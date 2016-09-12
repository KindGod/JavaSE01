package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ��������Ԫ��
 * Collection�ṩ��һ������
 * Iterator iterator()
 * �÷������Ի�ȡһ������������ǰ���ϵĵ�����
 * 
 * ������Iterator������һ���ӿ�,ֻ�����˱�������
 * �ķ���Ӧ������Щ������û�о���ʵ�֡���ͬ�ļ���
 * ���ṩ�����ڱ�������Ԫ�صĵ�����ʵ���ࡣ
 * 
 * ����������ѭ��ԭ��:
 * ��ȡɾ������ɾ��Ԫ�ز��Ǳ��������
 * @author Administrator
 * 
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		
		//��ȡ���ڱ�����ǰ���ϵĵ�����
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * �ʵĹ��̣��÷������жϵ�ǰ�������Ƿ�
		 * ����Ԫ�ؿ��Ա�ȡ���������򷵻�true
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * ȡ�Ĺ���:�÷����Ὣ��������һ��Ԫ�ط��ء�
			 */
			Object obj = it.next();
			String str = (String)obj;
			System.out.println(str);
			/*
			 * ��������Ҫ�ж�һ��������������
			 * �����Ƿ�һ��ʱ��Ӧ��ʹ��������
			 * ��equals����ȥ������Ƚϣ���
			 * ���Ա����ָ��ĳ���
			 * 
			 */
			if("#".equals(str)){
				c.remove(str);
				/*
				 * ʹ�õ������������ϵĹ�����
				 * ����ͨ�����ϵķ����ı�Ԫ��
				 * ������������ܵ��µ���������
				 * ʧ�ܡ����ǿ���ͨ���������ṩ��
				 * remove����ɾ��ͨ��next����
				 * ����������Ԫ�ء�
				 */
				it.remove();
			}
		}	
		System.out.println(c);
	}
}
