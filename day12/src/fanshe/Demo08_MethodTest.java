package fanshe;

import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo08_MethodTest {
	public static void main(String[] args)throws Exception {
        Properties properties = new Properties();
        FileReader fr = new FileReader("day12\\person.properties");
        properties.load(fr);
        System.out.println(properties);

        String className = properties.getProperty("className");
        String classMethod = properties.getProperty("classMethod");
        //System.out.println(classMethod);

        method01(className,classMethod);
    }

    private static void method01(String className, String classMethod) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取Person的Class对象
        Class aClass = Class.forName(className);

        //获取方法
        Method method = aClass.getMethod(classMethod);

        //根据构造创建对象
        Object o = aClass.newInstance();

        //调用Method类中的invoke方法
        method.invoke(o);

    }
}
