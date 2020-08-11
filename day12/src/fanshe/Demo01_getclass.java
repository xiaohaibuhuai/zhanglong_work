package fanshe;
/**
 * 获取Class对象
        1.Object类中的getClass方法


        2.任何类型都有一个隐藏的静态属性   class


        3.Class类中的方法 forName(String className)

 * @author zhanglong
 *
 */
public class Demo01_getclass {
	  public static void main(String[] args) throws ClassNotFoundException {
	        //创建Person对象
	        Person person = new Person();
	        Class aClass = person.getClass();

	        Class aClass1 = Person.class;

	        System.out.println(aClass==aClass1);

	        Class person1 = Class.forName("cn.itcast.day12.fanshe.Person");
	        System.out.println(person1==aClass1);
	    }
}
