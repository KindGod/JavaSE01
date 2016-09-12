package day02;
/**
 * Point ��ʾֱ������ϵ�ϵ�һ����
 * �ø�����ϰ��дObject����ط���
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
		 * ��дObject��toString����
		 * ��ʱ��Ҫ��д��
		 * ͨ��ֻҪ���ڳ�����ʹ�õ�ǰ���ʵ����toString
		 * ������Ӧ����д��ԭ������Objectʵ�ֵ�toString
		 * ��ʽΪ������@��ַ�����ܾ���˵����ǰ���������Ϣ
		 * ����������Ҫ��д��
		 * 
		 * ��д�󷵻ص��ַ���û�о���ĸ�ʽҪ��ԭ����
		 * ����Ҫ��ע��������Ϣƴ��һ�����ַ�������ʽ
		 * ���ء�
		 */
	    public String toString(){
			return "("+x+","+y+")";
		}
	    
		/*
		 * ��дObject�����equals�������÷���������
		 * ���жϵ�ǰ����������Ķ���"����"
		 * ʵ�ʾ��Ǹ�������������������жϱ�׼
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
	    
		//��ϣֵ	
		public static void main(String[] args){
			Point p = new Point(1,2);
			Point p1 = new Point(1,2);
			/*
			 * �����������ͱ������ԣ�����Ķ����
			 * ��ַ��
			 * "=="�Ƚϵ��Ǳ�����ֵ����ô������൱�ڱȽϵ�
			 * ��������ַ�Ƿ�һ��������������
			 * ����ָ��ͬһ�����󣬷����ַ�϶���ͬ
			 * �ɴ˿������Ϊ"=="�Ƚϵ�Ϊ��"�ǲ���ͬһ��"
			 */
			System.out.println(p == p1);//false
			System.out.println(p.equals(p1));//true
		    /*
		     * System.out.println(Object o)
		     * �÷������Խ��κ�java�еĶ��������
		     * ����̨��ʵ���ϣ���������Ǹ����Ķ���toString()����
		     * ���ص��ַ�����
		     * 
		     * java api�д󲿷ֵ��඼��д��toString
		     * ���������Լ���������ʵ����Ҫ���÷���
		     * ���������̨��ͨ����������Ҫ��дtoString
		     */
			System.out.println(p);
	}
		
}
