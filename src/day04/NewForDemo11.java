package day04;
/**
 * ��ѭ����Ҳ����:��ǿforѭ������ǿѭ����for_each
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
		}//ȱ�㲻��עѭ����������i
	}
}
