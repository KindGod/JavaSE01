package day03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Ҫ���û������Լ������գ�1992-10-21
 * �������㣬�����
 * ������Ϊֹ�Ѿ����˶������ˡ�
 * "��ϲ�㣬�Ѿ�����8567�죬���������Ŷ��"
 * 
 * @author Administrator
 * 
 */
public class SimpleDateFormatDemo3 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������գ�(yyyy-MM-dd)");
		String str = scanner.nextLine();
		scanner.close();
		SimpleDateFormat sdf 
		    = new SimpleDateFormat("yyyy-MM-dd");
		//����
		Date birth = sdf.parse(str);
		//��ǰʱ��
		Date now = new Date();
		
		long time = now.getTime()-birth.getTime();
		time = time/1000/60/60/24 ;
		System.out.println("��ϲ�㣬�Ѿ�����"+time+"�죬���������Ŷ��");
	}
}
