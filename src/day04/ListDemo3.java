package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ���������Ի�ȡ�䲿������(ȡ�Ӽ�)
 * @author Administrator
 * 
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list //���Ͳ����û����������ͣ�ֻ����������
		        = new ArrayList<Integer>();
		
	    for(int i=0;i<10;i++){
	    	list.add(i);
	    }
	    System.out.println(list);
	    
	    /*
	     * List subList(int start,int end)
	     * ��ȡ��ǰ������ָ����Χ�ڵ��Ӽ�
	     */
	    List<Integer> subList
	        = list.subList(3,8);//��β����ͷ
	    System.out.println(subList);
	    
	    /*
	     * ���Ӽ���ÿ��Ԫ������10��
	     */
	    for(int i=0;i<subList.size();i++){
	    	int d = subList.get(i);
	    	d = d*10;
	    	subList.set(i,d);
	    }
	    System.out.println(subList);
	  /*
	   * �Ӽ��Ĳ�������Ӱ��ԭ����
	   */
	    System.out.println(list);
	    /*
	     * �Ӽ�Ԫ�������ԭ�������ⲿ��Ԫ��Ҳ��ɾ����
	     * ������ɾ���������ݿ����õ�
	     */
	    subList.clear();
	    System.out.println(list);
	}
}
