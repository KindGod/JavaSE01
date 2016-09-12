package day05;

import java.util.Comparator;

/**
 * 自定义比较器，并使用它对集合元素进行比较，然后
 * 进行自然排序
 * Collections有一个重载的sort方法。允许我们
 * 传入一个比较器，并按照比较器的比较规则对集合
 * 进行自然排序。
 * @author Administrator
 */
public class SortCollectionDemo4 {
	public static void main(String[] args) {
		
	}
}
/**
 * 自定义的比较器，来比较字符串的大小，规则为
 * 字符多的大。
 * @author Administrator
 */
class MyComparator 
             implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}