package day01;
/**
 * String�ṩ��һ�龲̬����valueOf()
 * �÷��������ɵ����ء�������������������ת��Ϊ�ַ�����
 * ���õ��ǽ���������ת��Ϊ�ַ���
 * 
 * @author Administrator
 */
public class StringDemo11 {
	public static void main(String[] args){
		
		String istr = String.valueOf(123);
		System.out.println(istr);
		
		String dstr = String.valueOf(123.123);
		System.out.println(dstr+"4");
		
		String str = 123 +"";//���ַ���Ҳ����ת���ַ���
		System.out.println(str);
	}
}
