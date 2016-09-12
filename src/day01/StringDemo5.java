package day01;
/**
 * 截取一个地址中的域名
 * @author Administrator
 * 
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String url = "www.oracle.com";
		/*            01234567890123
		 * 思路：
		 * 截取地址中第一个"."后面第一个字符，一直到
		 * 第二个点之前的内容
		 */
		int start = url.indexOf(".")+1;
		int end= url.indexOf(".",start);//规定格式
		
		String name = url.substring(start,end);
		System.out.println(name);//oracle
		System.out.println(end);//10
	}
}
