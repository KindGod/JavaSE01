package day05;
/**
 * HashMap中作为Key的元素的hashcode方法的重写
 * 与equals的重写直接影响着HashMap检索性能
 * 所以要妥善的重写
 * JDK文档中规定，当我们重写一个类的equals方法时
 * 就应当连同重写hashcode方法。
 * 并且，两个方法有一个对应关系:
 * 若两个对象equals方法比较为true，那么
 * hashcode值一定要相等。
 * 反过来,若两个对象hashcode值不相同,
 * 最好也保证两个对象equals比较为true,
 * 否则会影响散列表性能（散列表等于哈希表）
 * 
 * hashcode()方法自身的重写规则:
 * 一个对象的hashcode值在该对象equals比较中参与的
 * 属性没有被改变的前提下，多次调用返回的值应当相同。
 * 
 * @author Administrator
 * 
 */
public class Cell {
	private int row;
	private int col;
	public Cell(int row,int col){
		super();
		this.row = row;
		this.col = col;	
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
}
