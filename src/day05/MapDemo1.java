package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * ÿ��Ԫ�������������key:value
 * ����Map����������һ���������еı��
 * Map��Ҫ�������������������value������value����
 * �ɶ��Բ��ߣ���Ҫ�Ӽ���"��ǩ"���Խ��ͺ��塣
 * ��Map��key�ǲ������ظ��ģ��Ƿ��ظ�ȡ����key��
 * equals�Ƚ�
 * @author Administrator
 * 
 */
public class MapDemo1 {
	public static void main(String[] args) {
	    Map<String,Integer> map //���Ϳ��Զ��
	        = new HashMap<String,Integer>();
	    
	    /*
	     * V put(K k,V v)
	     * ��������key��value���뵱ǰMap�С�
	     * ����key��Map�в������ظ�������ʹ��
	     * ��ͬ��key���벻ͬԪ�أ������滻value
	     * ���������滻��value�ᱻ����
	     * ����ŵ�key��map�в����ڣ�����ֵ��Ϊnull
	     */
	    map.put("����",98);
	    map.put("��ѧ",95);
	    map.put("Ӣ��",92);
	    map.put("����",97);
	    map.put("��ѧ",96);
	    
	    System.out.println(map);
	    /*
	     * ������put��������Ҫ��ȡ����ֵʱ����value
	     * ������ʱ��װ�࣬�мɽ���ʱ�����Ӧ�Ļ�������
	     * ��ᵼ���Զ����䡣������ֵΪnull�����Զ�����
	     * ʱ���׳���ָ���쳣!
	     */
	    Integer num = map.put("����",90);
	    System.out.println(map);
	    System.out.println(num);
	    /*
	     * ���ݸ�����key��ȡ��Ӧ��value
	     * ��������key��Map�в����ڣ��򷵻�null
	     */
	    //��ѧ�ɼ�?
	    Integer value = map.get("��ѧ");
	    System.out.println("��ѧ��"+value);
	    /*
	     * V remove(K k)
	     * ��Map��ɾ��������key����Ӧ����һ����¼
	     * (key,value����ɾ��)���������key��Ӧ
	     * ��value���ء�
	     */
	    //ɾ����ѧ
	    Integer old = map.remove("��ѧ");
	    System.out.println(map);
	    System.out.println("old:"+old);
	}
}
