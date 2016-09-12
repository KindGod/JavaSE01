package day02;
/**
 * Point 表示直角坐标系上的一个点
 * 用该类练习重写Object中相关方法
 * @author Administrator
 */
public class Point {
		private int x;
		private int y;
		
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
		/*
		 * 重写Object的toString方法
		 * 何时需要重写：
		 * 通常只要会在程序中使用当前类的实例的toString
		 * 方法就应当重写，原因在于Object实现的toString
		 * 格式为：类名@地址，不能具体说明当前类的特征信息
		 * 所以我们需要重写。
		 * 
		 * 重写后返回的字符串没有具体的格式要求，原则是
		 * 将需要关注的属性信息拼在一起以字符串的形式
		 * 返回。
		 */
	    public String toString(){
			return "("+x+","+y+")";
		}
	    
		/*
		 * 重写Object定义的equals方法，该方法的作用
		 * 是判断当前对象与给定的对象"像不像"
		 * 实际就是根据自身的需求来定义判断标准
		 */
	    public boolean equals(Object obj){
	    	if(obj == null){
	    		return false;
	    	}if(obj == this){
	    		return true;
	    	}
	    	if(obj instanceof Point){
	    		Point p = (Point)obj;
	    		return p.x == this.x&&p.y == this.y;
	    	}
	    	return false;
	    }
	    
		//哈希值	
		public static void main(String[] args){
			Point p = new Point(1,2);
			Point p1 = new Point(1,2);
			/*
			 * 对于引用类型变量而言，保存的对象的
			 * 地址。
			 * "=="比较的是变量的值，那么这里就相当于比较的
			 * 是两个地址是否一样，除非这两个
			 * 变量指向同一个对象，否则地址肯定不同
			 * 由此可以理解为"=="比较的为："是不是同一个"
			 */
			System.out.println(p == p1);//false
			System.out.println(p.equals(p1));//true
		    /*
		     * System.out.println(Object o)
		     * 该方法可以将任何java中的对象输出到
		     * 控制台。实际上，它输出的是给定的对象toString()方法
		     * 返回的字符串。
		     * 
		     * java api中大部分的类都重写了toString
		     * 若是我们自己定义的类的实例需要被该方法
		     * 输出到控制台，通常这个类就需要重写toString
		     */
			System.out.println(p);
	}
		
}
