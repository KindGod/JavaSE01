package day04;

public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * ���Ͳ����������Ľ�Point�е������Լ�����
		 * �����ͷ���ֵ�ĳ���Integer
		 * ���Ǵ����ķ�����ʵ����ΪObject,ֻ����
		 * ���䵱��Integerȥ������
		 */
		Point<Integer> p
		    = new Point<Integer>(1,2);
		//����������ʵ���Ƿ���Ϸ���Ҫ��
		p.setX(2);
		//��ȡʱҲ�������ͣ����Զ�����Ϊ����Ҫ������
		int x = p.getX();
		System.out.println("x="+x);
		
		//����ָ�����͵ľ������ͣ�Ĭ�Ͼ���Object
		Point p2 = p;
		p2.setX("1");
		/*
		 * ����x�Ѿ���String���ͣ����Ե���p�ĽǶ�
		 * ��ȡʱ�Զ�ǿתΪIntegerʱ���׳�
		 * ClassCastException���������쳣
		 */
		x = p.getX();
	}
}
