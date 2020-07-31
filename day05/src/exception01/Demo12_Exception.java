package exception01;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 异常中,方法重写的注意事项
      1.父类中方法如果抛了异常,那子类重写后的方法要不要抛异常
           可抛可不抛

           如果抛了,要不就要和父类抛出的异常一致,要不就抛父类异常的子类

      2.父类中方法如果没有抛异常,那么子类重写后的方法要不要抛异常呢?
            不要抛
            如果一定有异常,子类中重写的方法要自己try...catch
 * @author zhanglong
 *
 */
public class Demo12_Exception {

}
class Fu{
    public void method()throws Exception {
        System.out.println("我是父类的method方法");
    }
}

class Zi extends Fu{
    @Override
    public void method()throws FileNotFoundException{
       /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        try {
            simpleDateFormat.parse("2019");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        System.out.println("我是重写的method方法");
    }
}