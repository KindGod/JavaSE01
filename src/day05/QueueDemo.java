package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����
 * �뼯�����ƣ����Ա���һ��Ԫ�ء����ǲ����������
 * ���е�Ԫ�ء���ȡ������ѭ�Ƚ��ȳ�ԭ��
 * @author Administrator
 * 
 */
public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * ����LinkedList���Դ��һ��Ԫ�أ�����
		 * ��ɾЧ�ʱȽϸߣ�������Ҳʵ����Queue�ӿ�
		 * ���Կ�����һ������ʹ�á�
		 */
		Queue<String> queue
		    = new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * �����ĩβ׷��һ����Ԫ��
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		
		System.out.println(queue);
		
	    /*
	     * E poll()
	     * �Ӷ��׻�ȡԪ��,���ҽ���Ԫ�شӶ�����ɾ��
	     */
		String str = queue.poll();
		System.out.println(str);
		
		System.out.println(queue);
		
		/*
		 * E peek()
		 * �÷���Ҳ���ȡ��Ԫ�أ����ǲ�����
		 * ���Ӳ�������Ԫ�ز���Ӷ����б�ɾ��
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
