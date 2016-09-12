package day04;

public class TestPoint {
	public static void main(String[] args) {
		//具体在用的时候，再定义什么类型
		Point<Integer> p 
		        = new Point<Integer>(1,1);
		int x = p.getX();
		
		Point<Double> p1 
		        = new Point<Double>(1.1,2.2);
		double x1 = p1.getX();
		
		Point<String> p2 
		        = new Point<String>("一","二");
		String x2 = p2.getX();
	}
}
