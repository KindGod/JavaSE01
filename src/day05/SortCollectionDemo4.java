package day05;

import java.util.Comparator;

/**
 * �Զ���Ƚ�������ʹ�����Լ���Ԫ�ؽ��бȽϣ�Ȼ��
 * ������Ȼ����
 * Collections��һ�����ص�sort��������������
 * ����һ���Ƚ����������ձȽ����ıȽϹ���Լ���
 * ������Ȼ����
 * @author Administrator
 */
public class SortCollectionDemo4 {
	public static void main(String[] args) {
		
	}
}
/**
 * �Զ���ıȽ��������Ƚ��ַ����Ĵ�С������Ϊ
 * �ַ���Ĵ�
 * @author Administrator
 */
class MyComparator 
             implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}