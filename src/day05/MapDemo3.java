package day05;

import java.util.Collection;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map
 * 有三种方式:
 * 1:遍历所有的Key
 * 2:遍历所有的value(不常用)
 * 3:遍历每一组键值对
 * @author Administrator
 * 
 */
public class MapDemo3 {
	public static void main(String[] args) {
	     Map<String,Integer> map //泛型可以多个
             = new LinkedHashMap<String,Integer>();
	     /*
	      * LinkedHashMap可以是put进的元素顺序和
	      * 取出的元素顺序一样
	      */
         map.put("语文",98);
         map.put("数学",95);
         map.put("英语",92);
         map.put("物理",97);
         map.put("化学",96);
         
         /*
          * 1:遍历所有的Key
          * Set<K> keySet()
          * 该方法会将当前Map中所有的key存入一个
          * Set集合中，然后将集合返回。那么遍历该集合
          * 就相当于遍历了所有的key
          */
         Set<String> keySet = map.keySet();
         for(String key : keySet){
        	 Integer value = map.get(key);
        	 System.out.println(key+":"+value);
         }
         /*
          * Set<Entry<K,V>> entrySet()
          * 遍历每一组键值对
          * 在Map中每一组键值对是由一个Entry的实例
          * 保存的，所以该方法会将每一个Entry实例都
          * 存入一个Set集合，然后将该集合返回。遍历该集合
          * 拿到每一个Entry就相当于取到了每一组
          * 键值对达到遍历的目的。
          */
         Set<Entry<String,Integer>> entrySet
                           = map.entrySet();
         for(Entry<String,Integer> e:entrySet){
        	 String key = e.getKey();
        	 Integer value = e.getValue();
        	 System.out.println(key+":"+value);
         }
         
         /*
          * 3:遍历所有的value
          *   Collection<V> values()
          *   该方法会将当前Map中所有的value存入
          *   一个集合后返回。所以遍历当前集合就相当于
          *   比遍历了所有的value
          */
         Collection<Integer> values
             = map.values();
         for(Integer value : values){
        	 System.out.println("values:"+value);
         }
	}
}
