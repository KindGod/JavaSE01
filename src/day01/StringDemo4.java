package day01;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ����Ĳ�������
 * ��start����ʼ����ȡ��end(���ǲ�����end��Ӧ���ַ�)
 * java api �и��ص㣬����ʹ���������ֱ�ʾ��Χʱ��
 * ͨ������"��ͷ����β"�ġ�
 * @author Administrator
 */
public class StringDemo4 {
	public static void main(String[] args) {
		//            01234567890123
		String str = "www.oracle.com";
		//��ȡ
		String sub = str.substring(4,10);
		System.out.println(sub);
	}
}
