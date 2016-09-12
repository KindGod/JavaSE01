package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * สนำร
 */
public class SortCollectionDemo5 {
	public static void main(String[] args) {
		List<Point> list = 
				new ArrayList<Point>();
		list.add(new Point(3,4));
		list.add(new Point(1,5));
		list.add(new Point(7,8));
		list.add(new Point(2,4));
		
		System.out.println(list);
		
		Comparator<Point> comm
		      = new Comparator<Point>(){
				public int compare(Point o1, Point o2) {
					int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
					int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
					return len1-len2;
				}
		};
		Collections.sort(list,comm);
		System.out.println(list);
	}
}
