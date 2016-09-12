package day05;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ
 * ���һ��Ԫ�أ���ȡ������ѭ�Ƚ����ԭ��
 * һ��Ӧ���ڲ����Ŀ�׷����(���˹���)
 * @author Administrator
 * 
 */
public class StackDemo {
	public static void main(String[] args) {
		/*
		 * javaû��Ϊջ�����������
		 * ʹ��˫�˶���ʵ�֣�ֻ����һ��Ľ����ӷ�����
		 * ���γ���ջ��
		 * ����˫�˶������ھ���ջ�����ԣ�����Ϊ��
		 * ��ջ���������˴�һ���������������
		 * push,pop
		 */
		Deque<String> stack 
		    = new LinkedList<String>();
		/*
		 * void push(E e)
		 * ��Ԫ�ء�ѹ�롱ջ��
		 * ��ջ�������½�ȥ��Ԫ����ջ��(��һ��λ��)
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		
		/*
		 * E pop()
		 * ��ջ��������ȡջ��Ԫ�أ���ȡ���Ԫ��
		 * ���ջ��ɾ����
		 */
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//peekͬ������ʹ��
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		
		//����
		while(stack.size()>0){
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
