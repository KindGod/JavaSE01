package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * 每个元素由两部分组成key:value
 * 所以Map看起来像是一个多行两列的表格
 * Map主要解决的问题是遇到保存value，但是value自身
 * 可读性不高，需要加几个"标签"加以解释含义。
 * 在Map中key是不允许重复的，是否重复取决于key的
 * equals比较
 * @author Administrator
 * 
 */
public class MapDemo1 {
	public static void main(String[] args) {
	    Map<String,Integer> map //泛型可以多个
	        = new HashMap<String,Integer>();
	    
	    /*
	     * V put(K k,V v)
	     * 将给定的key与value存入当前Map中。
	     * 由于key在Map中不允许重复，所以使用
	     * 相同的key存入不同元素，就是替换value
	     * 操作，被替换的value会被返回
	     * 若存放的key在map中不存在，返回值则为null
	     */
	    map.put("语文",98);
	    map.put("数学",95);
	    map.put("英语",92);
	    map.put("物理",97);
	    map.put("化学",96);
	    
	    System.out.println(map);
	    /*
	     * 当调用put方法后需要获取返回值时，若value
	     * 的类型时包装类，切忌接收时用其对应的基本类型
	     * 这会导致自动拆箱。若返回值为null，则自动拆箱
	     * 时会抛出空指针异常!
	     */
	    Integer num = map.put("语文",90);
	    System.out.println(map);
	    System.out.println(num);
	    /*
	     * 根据给定的key获取对应的value
	     * 若给定的key在Map中不存在，则返回null
	     */
	    //化学成绩?
	    Integer value = map.get("化学");
	    System.out.println("化学："+value);
	    /*
	     * V remove(K k)
	     * 从Map中删除给定的key所对应的这一条记录
	     * (key,value都会删除)，并将这个key对应
	     * 的value返回。
	     */
	    //删除化学
	    Integer old = map.remove("化学");
	    System.out.println(map);
	    System.out.println("old:"+old);
	}
}
