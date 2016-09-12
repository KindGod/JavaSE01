package day01;

public class StringBuilderDemo2 {

	public static void main(String[] args) {
		StringBuilder builder
		=new StringBuilder("a");
		
		long start = System.currentTimeMillis();
		
      for(int i = 0;i<10000;i++){
    	  builder.append("a");
    	  System.out.println(builder.toString());
      }
      
      long end = System.currentTimeMillis();
      long time =(end-start);
      System.out.println("ÏûºÄÁË:"+ time +"ms");
	}
}
