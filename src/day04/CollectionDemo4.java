package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ����֧�ַ��ͣ�����Լ��Ԫ�ص�����
 * @author Administrator
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		/*
		 * ��ʹ��StringԼ���󣬼�����ֻ�ܴ��
		 * String����Ԫ�أ����һ�ȡҲ�����ٴ�
		 * ���͡�
		 */
		Collection<String> c
		    = new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		//�������Ͳ����Դ���
		//c.add(13);
		
		/*
		 * ����ͬ���з��͵�©��
		 */
//		Collection c1 = c ;
//		c1.add(123);
		
		//��ȡʱҲ����������
		for(String str : c){
			System.out.println(str);
		}
		
		/*
		 * ������Ҳ֧�ַ��ͣ������͵�ʵ������Ӧ��
		 * ��������ļ�����ָ���ķ�������һ��
		 */
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
}
