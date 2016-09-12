package day03;
import java.util.Date;
/**
 * java.util.Date
 * 其每一个实例都可以表示一个确切的时间点
 * 内部维护了一个long值，这是一个相对值，相对的是
 * UTC(1970年元旦)到这个时间点之间相差的毫秒数
 * 我们现在常用的计量时间的标准是格林威治时间。
 * @author Administrator
 * 
 */
public class DateDemo1 {
	public static void main(String[] args) {
		/*
		 * 默认创建出来的Date实例表示当前系统时间。 
		 */
	    Date now = new Date();
	    System.out.println(now);
	    /*
	     * Date提供了一个方法叫做：
	     * long getTime()
	     * 该方法可以获取当前Date对象维护的long值。
	     * 即：1970年元旦，到当前Date所表示的时间
	     * 之间经过的毫秒数。
	     */
	    long time = now.getTime();
	    System.out.println(time);
	    
	    //计算明天这一刻的毫秒值
	    time += 1000*60*60*24;
	    
	    //使当前Date表示给定的毫秒值表示的时间
	    now.setTime(time);
	    System.out.println(now);
	    
	    //创建一个Date的同时让其表示给定的时间
	    Date date = new Date(time);
	    System.out.println(date);
	}
}
