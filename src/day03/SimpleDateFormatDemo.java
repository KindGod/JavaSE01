package day03;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * java.text.SimpleDateFormat
 * �������Ҫ�����Ǹ���һ�����������ڸ�ʽ��
 * ��String��Date֮���໥ת����
 * ѧϰ������Ҫ��ס������:
 * 1.��д���ڸ�ʽ
 * 2.��ס����ת������
 * @author Administrator
 * 
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date now = new Date();
		/**
		 * Date�����ṩ��toString���ص�
		 * �ַ������ڷ�Ӣ�������������ʮ��
		 * �Ѻ�
		 */
		System.out.println(now);
		
		/**
		 * ϣ����ʾ�ĸ�ʽ��
		 * 2015-07-22 10:51:55
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
		   = new SimpleDateFormat(
				   "yyyy-MM-dd HH:mm:ss"
				   );
		/**
		 * Date-->String
		 * String format(Date date)
		 * �÷����Ὣ������Date��ʾ��ʱ�䰴��
		 * ��ǰSimpleDateFormatָ��������
		 * ��ʽת��Ϊ�ַ���
		 */
		String str = sdf.format(now);
		System.out.println(str);
	}
}
