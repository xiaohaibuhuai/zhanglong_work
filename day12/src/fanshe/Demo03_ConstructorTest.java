package fanshe;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * 获取Properties文件中的路径并获取空参构造并执行

     步骤:
        1.创建Properties集合
        2.创建FileReader对象,读取properties文件
        3.调用load方法将文件中的数据读到集合中
        4.调用getProperty(className)拿到对应的值
        5.调用Class类中的forName方法创建class对象
        6.获取构造方法,并执行
 * @author zhanglong
 *
 */
public class Demo03_ConstructorTest {
	public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileReader fr = new FileReader("day12\\person.properties");

        properties.load(fr);

//        System.out.println(properties);

        String className = properties.getProperty("className");

        Class aClass = Class.forName(className);

        Constructor constructor = aClass.getConstructor();

        //创建对象
        Object o = constructor.newInstance();
        System.out.println(o);
    }
}
