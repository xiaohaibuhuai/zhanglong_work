package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取有参构造并赋值执行
       Constructor getConstructor(Class... parameterTypes)

            Class... parameterTypes:参数类型的class对象

       创建对象并给属性赋值
            T newInstance(Object... initargs)
               Object... initargs:代表的是给属性赋予的具体的值
 * @author zhanglong
 *
 */
public class Demo04_Constructor {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = PersonUtil.getC();
        Constructor constructor = c.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object o = constructor.newInstance("柳岩", 36);//Person p = new Person("柳岩",36)
        System.out.println(o);
    }
}
