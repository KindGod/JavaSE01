package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序集合，排序通过集合的工具类Collections的
 * 静态方法sort实现自然排序。
 * @author Administrator
 * 
 */
/*区别：Collection是集合的接口，Collections是
 * 操作集合的工具类
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		List<Integer> list
		     =new ArrayList<Integer>();
		
		Random random = new Random();
		
		for(int i =0;i<10;i++){
			list.add(random.nextInt(100));
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
