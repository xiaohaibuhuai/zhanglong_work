package day01;
/**
 * java.util.Date:
     概述:类 Date 表示特定的瞬间，精确到毫秒。
          瞬间:就是一刹那的时间
          毫秒:是比秒还有小的时间单位
               1秒=1000毫秒

          作用:计算时间,可以测试代码的效率

          获取:System.currentTimeMillis()

          问题:计算从2018年6月6日到当前系统时间的差值

          时间原点:
              1970年1月1日00:00:00-->格林尼治时间

              地理知识:东8区    8:00
 * @author zhanglong
 *
 */
public class Date0102 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("涛哥是世界上第一帅的人");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
