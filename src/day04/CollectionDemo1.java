package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * �����ṩ����������Ԫ�صķ���
 * @author Administrator
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection c1 = new HashSet();
		c1.add("java");
		c1.add("c++");
		c1.add("oc");
		
		Collection c2 = new ArrayList();
		c2.add("php");
		c2.add("c#");
		c2.add("java");
		/*
		 * Collection�ṩ��һ��������ӵķ���
		 * boolean addAll(Collection c)
		 * �������ļ����е�����Ԫ����ӵ���ǰ����
		 * �У�������˲���������ǰ����Ԫ�ط����˱仯
		 * �򷵻�true
		 */
		c1.addAll(c2);
		System.out.println(c1);		
		
		Collection c3 = new ArrayList();
		c3.add("oc");
		c3.add("php");
		c3.add("vb");
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 * ���������򷵻�true
		 */
		boolean tf = c1.containsAll(c3);
		System.out.println("ȫ����:"+tf);
	}
}
