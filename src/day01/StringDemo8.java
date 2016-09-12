package day01;
/**
 * 检查一个字符串是否为回文？
 * @author Administrator
 * 
 */
public class StringDemo8 {
	public static void main(String[] args) {
		/*
		 * 上海自来水来自海上
		 * 思路：
		 * 正数位置上的字符与倒数位置上的字符
		 * 都一致，就是回文
		 */        // 0 1 2 3 4 5 6 7 8
		String str = "上海自来水来自海上";
		for(int i=0;i <str.length()/2;i++){
			if(str.charAt(i)!= 
					str.charAt(str.length()-1-i)
					){
				System.out.println("不是回文！");
				/*
				 * return有两个作用
				 * 1：结束方法
				 * 2：将结果返回
				 * 但是若方法返回值为void时
				 * return也是可以单独使用的，
				 * 用于结束方法。
				 */
			    return;
			}
		}
			System.out.println("是回文！");
	}
}
