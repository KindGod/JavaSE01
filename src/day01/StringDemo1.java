package day01;
/**
 * �ַ����ǲ�������ַ�������һ�������������ǲ��ɸı�ģ�Ҫ��ı�����һ���ᴴ���¶���
 * 
 * �ַ�����ʹ����������ʽ�������󣬻�������ǰ��������������ͬ���ַ�������
 * ʹ��new�ؼ��ִ������ַ����������ڲ�����볣����Ҳ�����鳣���أ����Բ������ö���
 * 
 * @author Administrator
 * 
 */
public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "Hello123";
		//��������ֵ�����ö���
		String s2 = "Hello123";
		//new�����򲻻����ã�
		String s3 = new String("Hello123");
		/*
		 * java��������һ���Ż���ʩ������������
		 * ���ʽ��������߶�������������ô������
		 * ������class�ļ�ʱ�ͽ����������ϲ�����
		 * ��������class�ļ����ˡ�
		 * ��������Ĵ�����class�ļ����ǣ�
		 * String s4 = "Hello123"; 
		 */
		String s4 = "Hello"+"123";
		
		String s5 = "Hello";
		String s6 = s5 + "123";
		
		String s7 = "Hello"+123;
		String s8 = "He" +'l'+"lo"+12+3;

		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1==s3);//false
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s3));//true
		
		System.out.println(s1==s4);//ture
		System.out.println(s1==s6);//false
		System.out.println(s1==s7);//true
		System.out.println(s1==s8);//true
	}
}
