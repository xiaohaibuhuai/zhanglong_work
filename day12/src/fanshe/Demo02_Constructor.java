package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取所有构造和空参构造并创建对象执行(获取所有构造以及空参构造)

      Constructor[] getConstructors() :可以获取所有的构造方法   public

       Constructor getConstructor():获取的是空参构造

         根据构造方法创建对象:
            newInstance()
 * @author zhanglong
 *
 */
public class Demo02_Constructor {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建Person对应的Class对象
        Class aClass = Class.forName("cn.itcast.day12.fanshe.Person");
       /* Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/

        Constructor constructor = aClass.getConstructor();
        Object o = constructor.newInstance();//Person p = new Person
        System.out.println(o);


    }
}
