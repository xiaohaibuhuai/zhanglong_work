package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取有私有的有参构造方法并赋值执行

       Constructor[] getDeclaredConstructors()-->获取所有的构造方法  包括私有的

       Constructor getDeclaredConstructor(Class... parameterTypes)-->根据参数类型获取对应的构造方法
                                                                     包括私有的

                                           Class... parameterTypes:参数类型的class对象

             void setAccessible(boolean flag):改变私有的访问权限-->暴力反射

                                默认是false:私有的
                                     true:取消访问权限


             创建对象并执行
                 T newInstance(Object... initargs)


             步骤:
                1.获取对应的Class对象
                2.调用Class对象中的getDeclaredConstructor获取指定的私有构造方法
                3.调用setAccessible(boolean flag)取消访问权限
                4.调用newInstance方法创建对象并给属性赋值

 * @author zhanglong
 *
 */
public class Demo05_Constructor {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建Person的Class对象
        Class c = PersonUtil.getC();
       /* //获取所有的构造方法
        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/

        Constructor dc = c.getDeclaredConstructor(String.class);
        //System.out.println(dc);

        //取消私有的访问权限
        dc.setAccessible(true);

        Object o = dc.newInstance("小泽");
        System.out.println(o);
    }
}
