package day02;
/**
 * String replaceAll(
 *    String regex,String replacement
 * )
 * �÷����Ὣ��ǰ�ַ���������������ʽ�Ĳ����滻Ϊ
 * �������ַ�����
 * 
 * @author Administrator
 */
public class StringDemo3 {
	public static void main(String []args){
		String str = "dsad687fdsf7675fsdf90";
		/*
		 * �����ֲ����滻Ϊ"#NUMBER"
		 */
		str = str.replaceAll("[0-9]+","#NUMBER");
		System.out.println(str);
	}
}
