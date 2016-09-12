package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 与集合相似，可以保存一组元素。但是不能任意访问
 * 其中的元素。存取必须遵循先进先出原则。
 * @author Administrator
 * 
 */
public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * 由于LinkedList可以存放一组元素，并且
		 * 增删效率比较高，所以其也实现了Queue接口
		 * 可以看做是一个队列使用。
		 */
		Queue<String> queue
		    = new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * 向队列末尾追加一个新元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		System.out.println(queue);
		
	    /*
	     * E poll()
	     * 从队首获取元素,并且将该元素从队列中删除
	     */
		String str = queue.poll();
		System.out.println(str);
		
		System.out.println(queue);
		
		/*
		 * E peek()
		 * 该方法也会获取首元素，但是不会做
		 * 出队操作，该元素不会从队列中被删除
		 */
		str = queue.peek();
		System.out.println(str);
		
		System.out.println(queue);
		
		System.out.println(queue.size());
		/*for(int i=0;i<queue.size();i++){
			str=queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
		*/
		while(queue.size()>0){
			str=queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
	}
}
