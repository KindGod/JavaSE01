package day01;
/**
 * ��ȡһ����ַ�е�����
 * @author Administrator
 * 
 */
public class StringDemo5 {
	public static void main(String[] args) {
		String url = "www.oracle.com";
		/*            01234567890123
		 * ˼·��
		 * ��ȡ��ַ�е�һ��"."�����һ���ַ���һֱ��
		 * �ڶ�����֮ǰ������
		 */
		int start = url.indexOf(".")+1;
		int end= url.indexOf(".",start);//�涨��ʽ
		
		String name = url.substring(start,end);
		System.out.println(name);//oracle
		System.out.println(end);//10
	}
}
