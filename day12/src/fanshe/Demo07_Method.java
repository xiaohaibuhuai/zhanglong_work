package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取方法之get,set并赋值执行

      方法:
         Method[] getMethods()-->获取所有的public修饰的成员方法，包括父类中。

         Method getMethod("方法名", 方法的参数类型... 类型)-->如果获取的方法没有参数,那么只写方法名就可以了

         Object invoke(Object obj, Object... args)-->执行获取到的方法
                        Object obj-->就是一个对象
                        Object... args-->传递的实参


       步骤:
          1.创建Class对象
          2.调用getMethod("方法名",参数类型的class对象),如果获取的方法没有参数,那么只写方法名就可以了
          3.调用newInstance方法根据空参构造创建对象
          4.调用Method类中的方法  invoke(对象,传递实参),如果获取的方法没有参数,那么不传递实际参数

 * @author zhanglong
 *
 */
public class Demo07_Method {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c = PersonUtil.getC();
        //获取所有的方法
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("---------获取指定的方法---------");

        Method cMethod = c.getMethod("setName", String.class);

        Object o = c.newInstance();//Person p = new Person
        Object result = cMethod.invoke(o, "锡迎");//p.setName("锡迎")
        System.out.println(o);

        System.out.println("--------------获取get方法-------------");

        Method getName = c.getMethod("getName");

        Object o1 = getName.invoke(o);
        System.out.println(o1);
    }
}
