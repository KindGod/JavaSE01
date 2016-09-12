package day01;
/**
 * StrngBuilder�ڲ�ά����һ���ɱ���ַ�����
 * �Ӷ���֤�������޸Ķ��ٴ��ַ������ݣ������������������ɡ�
 * ��Ȼ�����������ݱ������������ݣ��������ַ������޸ıȽϣ�
 * �ڴ��ϵ����������Եġ�
 * ���ṩ�������޸��ַ������ݵĳ����޸ķ�����
 * ����append
 * ɾ��delete
 * �ģ�replace
 * �壺insert
 * @author Administrator
 * 
 */
public class StringBuilderDemo {
	public static void main(String []args){
		String str = "Ŭ��ѧϰjava";
		/*
		 * �����޸��ַ����������ֽ���任Ϊһ��
		 * StringBuilder
		 */
		StringBuilder builder
				=new StringBuilder(str);
		
		//Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		builder.append("��Ϊ���Ҹ��ù���");
		
		//��ȡStringBuilder�ڲ���ʾ���ַ���
		str = builder.toString();
		System.out.println(str);
		
		//Ŭ��ѧϰjava������Ϊ�˸ı�����
		builder.replace(9, 16, "����Ϊ�˸ı����磡");
		System.out.println(builder.toString());
		
		//,����Ϊ�˸ı����磡
		builder.delete(0,8);
		System.out.println(builder.toString());
		
		//���ţ�����Ϊ�˸ı�����
		builder.insert(0, "����");
		System.out.println(builder.toString());
		
		//���ţ�����Ϊ�˸��õظı�����
		builder.insert(7,"���õ�");
		System.out.println(builder.toString());
		
		//��ת�ַ���
		builder.reverse();
		System.out.println(builder.toString());
	}

}
