package day03;
import java.util.Date;
/**
 * java.util.Date
 * ��ÿһ��ʵ�������Ա�ʾһ��ȷ�е�ʱ���
 * �ڲ�ά����һ��longֵ������һ�����ֵ����Ե���
 * UTC(1970��Ԫ��)�����ʱ���֮�����ĺ�����
 * �������ڳ��õļ���ʱ��ı�׼�Ǹ�������ʱ�䡣
 * @author Administrator
 * 
 */
public class DateDemo1 {
	public static void main(String[] args) {
		/*
		 * Ĭ�ϴ���������Dateʵ����ʾ��ǰϵͳʱ�䡣 
		 */
	    Date now = new Date();
	    System.out.println(now);
	    /*
	     * Date�ṩ��һ������������
	     * long getTime()
	     * �÷������Ի�ȡ��ǰDate����ά����longֵ��
	     * ����1970��Ԫ��������ǰDate����ʾ��ʱ��
	     * ֮�侭���ĺ�������
	     */
	    long time = now.getTime();
	    System.out.println(time);
	    
	    //����������һ�̵ĺ���ֵ
	    time += 1000*60*60*24;
	    
	    //ʹ��ǰDate��ʾ�����ĺ���ֵ��ʾ��ʱ��
	    now.setTime(time);
	    System.out.println(now);
	    
	    //����һ��Date��ͬʱ�����ʾ������ʱ��
	    Date date = new Date(time);
	    System.out.println(date);
	}
}
