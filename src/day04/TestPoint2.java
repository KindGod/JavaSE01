package day04;

public class TestPoint2 {
	public static void main(String[] args) {
		/*
		 * 泛型并非是真正的将Point中的属性以及方法
		 * 参数和返回值改成了Integer
		 * 而是创建的泛型真实类型为Object,只不过
		 * 将其当做Integer去看待。
		 */
		Point<Integer> p
		    = new Point<Integer>(1,2);
		//编译器会检查实参是否符合泛型要求
		p.setX(2);
		//获取时也无需造型，会自动造型为泛型要求类型
		int x = p.getX();
		System.out.println("x="+x);
		
		//若不指定泛型的具体类型，默认就是Object
		Point p2 = p;
		p2.setX("1");
		/*
		 * 由于x已经是String类型，所以当以p的角度
		 * 获取时自动强转为Integer时会抛出
		 * ClassCastException，类造型异常
		 */
		x = p.getX();
	}
}
