package day01;
//import java.lang.String;Ĭ�ϻᵼ��
/**
 * String trim()
 * ȥ����ǰ�ַ��������ߵĿհס�
 * @author Administrator
 * 
 */
public class StringDemo6 {
	public static void main(String[] args) {
		String str = "  Hello		";
		String s = str.trim(); 
		System.out.println(s);//Hello
		System.out.println(str);//  Hello		
	}
}
