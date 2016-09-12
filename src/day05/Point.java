package day05;
/**
 * 用当前类来测试集合排序自定义元素
 * 该类用于表示直角坐标系上一点
 * @author Administrator
 * 
 * 若想使用Collections的静态方法sort(List,List)
 * 进行自然排序，那么该元素必须实现Comparable接口
 * 并定义比较规则才可以。
 */
public class Point //谁实现接口谁就是泛型
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
	 * 当我们实现了Comparable接口后，该接口要求
	 * 我们必须重写compareTo方法，该方法的作用是
	 * 是当前对象与给定对象比较大小。
	 * 返回值是一个int值，该值不关心具体取值，只关心
	 * 取值范围。
	 * 若返回值<0:当前对象比给定的对象小
	 * 若返回值=0:两个对象相等
	 * 若返回值>0:当前对象比给定的对象大
	 * 
	 * 判断标准，点到原点的距离长的大
	 */
	public int compareTo(Point o) {//定义了比较大小的规则
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
