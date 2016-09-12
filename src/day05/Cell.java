package day05;
/**
 * HashMap����ΪKey��Ԫ�ص�hashcode��������д
 * ��equals����дֱ��Ӱ����HashMap��������
 * ����Ҫ���Ƶ���д
 * JDK�ĵ��й涨����������дһ�����equals����ʱ
 * ��Ӧ����ͬ��дhashcode������
 * ���ң�����������һ����Ӧ��ϵ:
 * ����������equals�����Ƚ�Ϊtrue����ô
 * hashcodeֵһ��Ҫ��ȡ�
 * ������,����������hashcodeֵ����ͬ,
 * ���Ҳ��֤��������equals�Ƚ�Ϊtrue,
 * �����Ӱ��ɢ�б����ܣ�ɢ�б���ڹ�ϣ��
 * 
 * hashcode()�����������д����:
 * һ�������hashcodeֵ�ڸö���equals�Ƚ��в����
 * ����û�б��ı��ǰ���£���ε��÷��ص�ֵӦ����ͬ��
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
