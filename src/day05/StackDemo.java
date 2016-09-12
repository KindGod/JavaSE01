package day05;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 存放一组元素，存取必须遵循先进后出原则
 * 一般应用于操作的可追溯性(后退功能)
 * @author Administrator
 * 
 */
public class StackDemo {
	public static void main(String[] args) {
		/*
		 * java没有为栈单独设计类型
		 * 使用双端队列实现，只调用一侧的进出队方法，
		 * 就形成了栈。
		 * 不过双端队列由于具有栈的特性，所以为此
		 * 给栈单独定义了从一侧进出的两个方法
		 * push,pop
		 */
		Deque<String> stack 
		    = new LinkedList<String>();
		/*
		 * void push(E e)
		 * 将元素“压入”栈中
		 * 入栈操作，新进去的元素在栈顶(死一个位置)
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		
		/*
		 * E pop()
		 * 出栈操作。获取栈顶元素，获取后该元素
		 * 会从栈中删除。
		 */
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		//peek同样可以使用
		str = stack.peek();
		System.out.println(str);
		System.out.println(stack);
		
		//遍历
		while(stack.size()>0){
			str = stack.pop();
			System.out.println(str);
		}
		System.out.println(stack);
	}
}
