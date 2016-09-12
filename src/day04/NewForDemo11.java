package day04;
/**
 * 新循环，也叫做:增强for循环，增强循环，for_each
 * @author Administrator
 */
public class NewForDemo11 {
	public static void main(String[] args) {
		String[] array = new String[]{"one","two","threee","four","five"};
		
//		for(int i = 0;i<array.length;i++ ){
//			String str = array[i];
//			System.out.println(str);
//		}
		
		for(String str:array){
			System.out.println(str);
		}//缺点不关注循环变量，即i
	}
}
