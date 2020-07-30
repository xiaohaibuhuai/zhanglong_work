package exception01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 错误和异常的区别

     异常:
        人得了小感冒,可以通过治疗解决,可以通过代码来解除异常

        运行时期异常:RuntimeException:编写得时候代码不报错,但是程序一运行就报错
        编译时期异常:Exception:代码一写,编译就报错了

     错误:
        人得了绝症,治不了,不能通过代码去解决
 * @author zhanglong
 *
 */
public class Demo01_Exception {
	public static void main(String[] args) throws ParseException {
        //运行时期异常
       /* int[] arr = {1,2,3};
        System.out.println(arr[3]);*/

       //编译时期异常
       /* SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        Date date = simpleDateFormat.parse("2017");*/

       /* int[] arr = new int[999999999];
        System.out.println(arr[0]);*/

        System.out.println(1/0);
    }
}
