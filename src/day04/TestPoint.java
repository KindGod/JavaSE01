package day04;

public class TestPoint {
	public static void main(String[] args) {
		//�������õ�ʱ���ٶ���ʲô����
		Point<Integer> p 
		        = new Point<Integer>(1,1);
		int x = p.getX();
		
		Point<Double> p1 
		        = new Point<Double>(1.1,2.2);
		double x1 = p1.getX();
		
		Point<String> p2 
		        = new Point<String>("һ","��");
		String x2 = p2.getX();
	}
}
