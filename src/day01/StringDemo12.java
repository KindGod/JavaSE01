package day01;
/**
 * Ƶ���޸��ַ�����������Դ����������
 * ����ʱ���ܵ���ϵͳ����
 * @author Administrator
 */
public class StringDemo12 {
	public static void main(String[] args) {
		String str = "a";
		long start = System.currentTimeMillis();
		for(int i = 0;i<1000000;i++){
			str+="a";
		}
		long end = System.currentTimeMillis();
		long time =(end-start);
		System.out.println(str);
		System.out.println("������:"+time+"ms");
	}
}
