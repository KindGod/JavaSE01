package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一个方法可以获取其部分内容(取子集)
 * @author Administrator
 * 
 */
public class ListDemo3 {
	public static void main(String[] args) {
		List<Integer> list //泛型不能用基本数据类型，只能用引用类
		        = new ArrayList<Integer>();
		
	    for(int i=0;i<10;i++){
	    	list.add(i);
	    }
	    System.out.println(list);
	    
	    /*
	     * List subList(int start,int end)
	     * 获取当前集合中指定范围内的子集
	     */
	    List<Integer> subList
	        = list.subList(3,8);//含尾不含头
	    System.out.println(subList);
	    
	    /*
	     * 将子集中每个元素扩大10倍
	     */
	    for(int i=0;i<subList.size();i++){
	    	int d = subList.get(i);
	    	d = d*10;
	    	subList.set(i,d);
	    }
	    System.out.println(subList);
	  /*
	   * 子集的操作都会影响原集合
	   */
	    System.out.println(list);
	    /*
	     * 子集元素清除后，原集合中这部分元素也被删除了
	     * ，快速删除部分内容可以用到
	     */
	    subList.clear();
	    System.out.println(list);
	}
}
