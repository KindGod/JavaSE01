package day02;

/**
 * ��װ��
 * Ϊ�˽�������������ݲ��ܲμ�������󿪷��������
 * 
 * ����6���������͵İ�װ�඼�̳���Number
 * Number��һ�������࣬�ṩ�˿��Խ������ڲ�ͬ���ͼ�
 * ����ת���ķ���������ͨ�����Ƕ�����������ת��
 * ����:short->int
 * int->shortҲ���ԣ���������short����С��ת������
 * ���ֿ��ܲ���ȷ��
 * @author Administrator
 * 
 */
import java.util.Date;

public class IntegerDemo {
	public static void main(String[] args) {
		dosome("asd");
		dosome(new Date());
		int i = 1;
		Integer inte = new Integer(i);
		i = inte.intValue();
		dosome(inte);
	}
	
	public static void dosome(Object obj){
		
	}
}
class Integer{
	private int i;
	public Integer(int i){
		this.i = i ;
	}
	
	public int intValue(){
		return i ;
	}
}
