package day01;
/**
 * ���һ���ַ����Ƿ�Ϊ���ģ�
 * @author Administrator
 * 
 */
public class StringDemo8 {
	public static void main(String[] args) {
		/*
		 * �Ϻ�����ˮ���Ժ���
		 * ˼·��
		 * ����λ���ϵ��ַ��뵹��λ���ϵ��ַ�
		 * ��һ�£����ǻ���
		 */        // 0 1 2 3 4 5 6 7 8
		String str = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i <str.length()/2;i++){
			if(str.charAt(i)!= 
					str.charAt(str.length()-1-i)
					){
				System.out.println("���ǻ��ģ�");
				/*
				 * return����������
				 * 1����������
				 * 2�����������
				 * ��������������ֵΪvoidʱ
				 * returnҲ�ǿ��Ե���ʹ�õģ�
				 * ���ڽ���������
				 */
			    return;
			}
		}
			System.out.println("�ǻ��ģ�");
	}
}
