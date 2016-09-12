package day02;

import java.util.Arrays;

/**
 * String[] spilt(String regex)
 * 将当前字符串中满足正则表达式的部分“切掉”，保留
 * 剩下的内容。
 * @author Administrator
 * 
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str ="asd123hjg345gh678hfg243hgf2123";
		String[] arr = str.split("[0-9]+");//或"//d+"
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 图片重命名
		 */
		String imgName = "1.jpg";
		//接"."拆分
		String[] names = imgName.split("\\.");
		//打桩
		System.out.println(Arrays.toString(names));
		//生成新名字
		System.currentTimeMillis();
		imgName = 1+","+names[1];
		System.out.println(imgName);
	}
}
