package exception01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译时期异常和运行时期异常的区别:

      编译时期异常:代码一写,编译的时候就爆红,如果不处理的话,后面代码没法走 ,需要处理
                 要不就throw 要不就try..catch

      运行时期异常:编译不会报错,运行的时候就报错-->一般我们不需要处理运行时期异常

 * @author zhanglong
 *
 */
public class Demo10_Exception {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
		Date date = simpleDateFormat.parse("2019");

        System.out.println("我要执行");
        System.out.println("=------------------------");

        int[] arr = {1};
        System.out.println(arr[1]);

	}
}
