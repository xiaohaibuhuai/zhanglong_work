package day01;
import java.util.Date;
/**
 * Date:
      包:java.util
      构造:
         Date():获取当前系统时间,将当前系统时间封装成Date对象
         Date(long date):根据指定的毫秒值去算时间,封装成Date对象

      方法:
         public long getTime() 把日期对象转换成对应的时间毫秒值
 * @author zhanglong
 *
 */
public class Date0202 {
	public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(12312312312L);
        System.out.println(date1);

        long time = date.getTime();
        System.out.println(time);
        long time1 = date1.getTime();
        System.out.println(time1);


    }
}