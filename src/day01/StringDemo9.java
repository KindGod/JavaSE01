package day01;
/**
 * boolean stratsWith(String str)
 * boolean endsWith(String str)
 * @author Administrator
 *
 * ����������һ���������жϵ�ǰ�ַ����Ƿ����Ը������ַ�����ʼ�ģ�
 * ��һ�����жϵ�ǰ�ַ����Ƿ��Ը������ַ�����β�ġ�
 * 
 */
public class StringDemo9 {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("th");
		System.out.println("starts:"+ starts);
		
		boolean ends= str.endsWith("va");
		System.out.println("ends:" + ends);
	}
}
