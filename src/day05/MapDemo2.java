package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * MapҲ�ṩ�˿��Բ鿴������key��value�Ƿ���Map
 * �б������ķ��������õ��ǲ鿴key�Ƿ񱻰���
 * @author Administrator
 * 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		 Map<String,Integer> map //���Ϳ��Զ��
	        = new HashMap<String,Integer>();
	    map.put("����",98);
	    map.put("��ѧ",95);
	    map.put("Ӣ��",92);
	    map.put("����",97);
	    map.put("��ѧ",96);
	    /*
	     * boolean containsKey(K k)
	     * �жϵ�ǰMap���Ƿ����������Key
	     * �ж�������Ȼ�Ǹ���key��equals�Ƚϵ�
	     * 
	     */
	    boolean conKey
	          = map.containsKey("����");
	    System.out.println("��������:"+conKey);
	    
	    /*
	     * boolean containsValue(V v)
	     * �жϵ�ǰMap���Ƿ����������value
	     * 
	     */
	    boolean conValue 
	         = map.containsValue(97);
	    System.out.println("����97:"+conValue);
	    
	}
}
