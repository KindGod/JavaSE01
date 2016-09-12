package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map也提供了可以查看给定的key或value是否在Map
 * 中被包含的方法，常用的是查看key是否被包含
 * @author Administrator
 * 
 */
public class MapDemo2 {
	public static void main(String[] args) {
		 Map<String,Integer> map //泛型可以多个
	        = new HashMap<String,Integer>();
	    map.put("语文",98);
	    map.put("数学",95);
	    map.put("英语",92);
	    map.put("物理",97);
	    map.put("化学",96);
	    /*
	     * boolean containsKey(K k)
	     * 判断当前Map中是否包含给定的Key
	     * 判断依据依然是根据key的equals比较的
	     * 
	     */
	    boolean conKey
	          = map.containsKey("物理");
	    System.out.println("包含物理:"+conKey);
	    
	    /*
	     * boolean containsValue(V v)
	     * 判断当前Map中是否包含给定的value
	     * 
	     */
	    boolean conValue 
	         = map.containsValue(97);
	    System.out.println("包含97:"+conValue);
	    
	}
}
