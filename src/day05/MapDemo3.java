package day05;

import java.util.Collection;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map
 * �����ַ�ʽ:
 * 1:�������е�Key
 * 2:�������е�value(������)
 * 3:����ÿһ���ֵ��
 * @author Administrator
 * 
 */
public class MapDemo3 {
	public static void main(String[] args) {
	     Map<String,Integer> map //���Ϳ��Զ��
             = new LinkedHashMap<String,Integer>();
	     /*
	      * LinkedHashMap������put����Ԫ��˳���
	      * ȡ����Ԫ��˳��һ��
	      */
         map.put("����",98);
         map.put("��ѧ",95);
         map.put("Ӣ��",92);
         map.put("����",97);
         map.put("��ѧ",96);
         
         /*
          * 1:�������е�Key
          * Set<K> keySet()
          * �÷����Ὣ��ǰMap�����е�key����һ��
          * Set�����У�Ȼ�󽫼��Ϸ��ء���ô�����ü���
          * ���൱�ڱ��������е�key
          */
         Set<String> keySet = map.keySet();
         for(String key : keySet){
        	 Integer value = map.get(key);
        	 System.out.println(key+":"+value);
         }
         /*
          * Set<Entry<K,V>> entrySet()
          * ����ÿһ���ֵ��
          * ��Map��ÿһ���ֵ������һ��Entry��ʵ��
          * ����ģ����Ը÷����Ὣÿһ��Entryʵ����
          * ����һ��Set���ϣ�Ȼ�󽫸ü��Ϸ��ء������ü���
          * �õ�ÿһ��Entry���൱��ȡ����ÿһ��
          * ��ֵ�Դﵽ������Ŀ�ġ�
          */
         Set<Entry<String,Integer>> entrySet
                           = map.entrySet();
         for(Entry<String,Integer> e:entrySet){
        	 String key = e.getKey();
        	 Integer value = e.getValue();
        	 System.out.println(key+":"+value);
         }
         
         /*
          * 3:�������е�value
          *   Collection<V> values()
          *   �÷����Ὣ��ǰMap�����е�value����
          *   һ�����Ϻ󷵻ء����Ա�����ǰ���Ͼ��൱��
          *   �ȱ��������е�value
          */
         Collection<Integer> values
             = map.values();
         for(Integer value : values){
        	 System.out.println("values:"+value);
         }
	}
}
