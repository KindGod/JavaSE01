package day02;

import java.util.Arrays;

/**
 * String[] spilt(String regex)
 * ����ǰ�ַ���������������ʽ�Ĳ��֡��е���������
 * ʣ�µ����ݡ�
 * @author Administrator
 * 
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String str ="asd123hjg345gh678hfg243hgf2123";
		String[] arr = str.split("[0-9]+");//��"//d+"
		System.out.println(Arrays.toString(arr));
		
		/*
		 * ͼƬ������
		 */
		String imgName = "1.jpg";
		//��"."���
		String[] names = imgName.split("\\.");
		//��׮
		System.out.println(Arrays.toString(names));
		//����������
		System.currentTimeMillis();
		imgName = 1+","+names[1];
		System.out.println(imgName);
	}
}
