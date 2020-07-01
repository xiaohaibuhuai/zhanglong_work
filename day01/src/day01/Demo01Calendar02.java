package day01;

import java.util.Calendar;
import java.util.Date;
/**
 * java.util.Calendar:日历类-->了解

      创建对象:
         方法:static Calendar getInstance()

      常用方法:
      public int get(int field)：返回给定日历字段的值。
      public void set(int field, int value)：将给定的日历字段设置为给定值。
      public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
      public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。

         field:日历类中的每一个字段:
            YEAR    年
            MONTH   月（从0开始，可以+1使用）
            DAY_OF_MONTH 月中的天（几号）
            HOUR 时（12小时制）
            HOUR_OF_DAY 时（24小时制）
            MINUTE 分
            SECOND 秒
            DAY_OF_WEEK 周中的天（周几，周日为1，可以-1使用）
 * @author zhanglong
 *
 */
public class Demo01Calendar02 {
    public static void main(String[] args) {
        /*创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);*/

        method04();
    }
   // public int get(int field)：返回给定日历字段的值。
    public static void method01(){
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);

        int i1 = calendar.get(Calendar.MONTH);
        System.out.println(i1+1);
    }

    //public void set(int field, int value)：将给定的日历字段设置为给定值。
    public static void method02(){
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,02);
        int i = calendar.get(Calendar.MONTH);
        System.out.println(i);
    }

    //public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
    public static void method03(){
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-1);

        //获取
        int i = calendar.get(Calendar.YEAR);
        System.out.println(i);
    }

    //public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    public static void method04(){
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
    }
}















