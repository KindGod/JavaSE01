package day01;
/**
 * int indexOf(String str)
 * �鿴�����ַ����ڵ�ǰ�ַ����е�λ�� (��0��ʼ)
 * ���ȸ÷�����ʹ�ø������ַ����뵱ǰ�ַ�������ȫƥ��
 * ���ҵ�λ�ú󣬻Ὣ�����ַ����е�һ���ַ��ڵ�ǰ�ַ����е�λ�÷��ء�
 * ���������ҹؼ���ʹ�á�
 * @author Administrator
 */
public class StringDemo3 {
    public static void main(String[] args){
    	/*
    	 * java���˼��
    	 *            0123456789012345
    	 */
    	String str = "thinking in java";
    	int index = str.indexOf("in");
    	System.out.println(index);//2����û�з���-1
        /*
    	 * ���ط���
    	 * �Ӹ���λ�ÿ�ʼѰ�ҵ�һ�γ��ָ����ַ�����λ��
    	 */
    	index = str.indexOf("in",3);
    	System.out.println(index);//5
    	
    	/*
    	 *int lastIndexOf(String str)
    	 *���ظ������ַ����ڵ�ǰ�ַ��������һ�γ��ֵ�λ�� 
    	 */
    	int last = str.lastIndexOf("in");
    	System.out.println(last);//9
    }
}
