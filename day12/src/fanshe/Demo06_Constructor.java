package fanshe;

import java.lang.reflect.InvocationTargetException;

/**
 * 反射,创建空参构造的快捷方式

        前提:
            1.类中必须有空参构造
            2.要是public的
 * @author zhanglong
 *
 */
public class Demo06_Constructor {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Class c = PersonUtil.getC();
       /* Constructor constructor = c.getConstructor();
        Object o = constructor.newInstance();*/
        //Object o = PersonUtil.getC().newInstance();
        System.out.println(PersonUtil.getC().newInstance());
    }
}
