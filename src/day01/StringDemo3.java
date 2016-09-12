package day01;
/**
 * int indexOf(String str)
 * 查看给定字符串在当前字符串中的位置 (从0开始)
 * 首先该方法会使用给定的字符串与当前字符串进行全匹配
 * 当找到位置后，会将给定字符串中第一个字符在当前字符串中的位置返回。
 * 常用来查找关键字使用。
 * @author Administrator
 */
public class StringDemo3 {
    public static void main(String[] args){
    	/*
    	 * java编程思想
    	 *            0123456789012345
    	 */
    	String str = "thinking in java";
    	int index = str.indexOf("in");
    	System.out.println(index);//2，若没有返回-1
        /*
    	 * 重载方法
    	 * 从给定位置开始寻找第一次出现给定字符串的位置
    	 */
    	index = str.indexOf("in",3);
    	System.out.println(index);//5
    	
    	/*
    	 *int lastIndexOf(String str)
    	 *返回给定的字符串在当前字符串中最后一次出现的位置 
    	 */
    	int last = str.lastIndexOf("in");
    	System.out.println(last);//9
    }
}
