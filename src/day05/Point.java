package day05;
/**
 * �õ�ǰ�������Լ��������Զ���Ԫ��
 * �������ڱ�ʾֱ������ϵ��һ��
 * @author Administrator
 * 
 * ����ʹ��Collections�ľ�̬����sort(List,List)
 * ������Ȼ������ô��Ԫ�ر���ʵ��Comparable�ӿ�
 * ������ȽϹ���ſ��ԡ�
 */
public class Point //˭ʵ�ֽӿ�˭���Ƿ���
            implements Comparable<Point>{
	private int x;
	private int y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * ������ʵ����Comparable�ӿں󣬸ýӿ�Ҫ��
	 * ���Ǳ�����дcompareTo�������÷�����������
	 * �ǵ�ǰ�������������Ƚϴ�С��
	 * ����ֵ��һ��intֵ����ֵ�����ľ���ȡֵ��ֻ����
	 * ȡֵ��Χ��
	 * ������ֵ<0:��ǰ����ȸ����Ķ���С
	 * ������ֵ=0:�����������
	 * ������ֵ>0:��ǰ����ȸ����Ķ����
	 * 
	 * �жϱ�׼���㵽ԭ��ľ��볤�Ĵ�
	 */
	public int compareTo(Point o) {//�����˱Ƚϴ�С�Ĺ���
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x + o.y*o.y;
		return len-olen;
	}
	public int getY() {
		return 0;
	}
	public int getX() {
		return 0;
	}
}
