package day01;
/**
 * 频繁修改字符串带来的资源与性能消耗
 * 严重时可能导致系统崩溃
 * @author Administrator
 */
public class StringDemo12 {
	public static void main(String[] args) {
		String str = "a";
		long start = System.currentTimeMillis();
		for(int i = 0;i<1000000;i++){
			str+="a";
		}
		long end = System.currentTimeMillis();
		long time =(end-start);
		System.out.println(str);
		System.out.println("消耗了:"+time+"ms");
	}
}
