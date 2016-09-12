package day04;
/**
 * 泛型
 * 表示一个点
 * @author Administrator
 * 
 */
public class Point<E> {
		private E x;
		private E y;
	 Point(E x,E y) {
		this.x = x;
		this.y = y;
	}
	 public E getX(){
			return x;
		}
		public void setX(E y){
			this.x = x;
		}
	public E getY(){
		return y;
	}
	public void setY(E y){
		this.y = y;
	}
	public String toString(){
		return "("+x+","+"y";
	}
	
}
