package day01;

import java.util.Objects;

/**
 * Object类中的toString方法

   如果一个类没有重写toString,我们直接输出对象名,就是一个地址值,直接输出对象名,默认调用了Object类中的toString方法

   如果一个类重写了Object类中的toString方法,那么直接输出对象名,就不再是地址值了(我们一般重写toString方法不让他输出地址值
   因为,没有意义了,所以一般重写toString方法,都是输出的属性内容)

   即使重写了toString方法,那么直接输出对象名也是默认调用了重写的toString
 * @author zhanglong
 /**Object类中的equals方法-->比较的是地址值
       public boolean equals(Object obj) {
        return (this == obj);
       }

       ==:针对于基本数据类型比较的是值
          针对于引用数据类型比较的是地址值

       总结:
         如果子类中没有重写Object类中的equals方法,那么再调用这个方法,比较的是地址值

         如果子类中重写了Object类中的equals方法,那么再比较地址值就没有意义了
           (比较的是属性内容)
 */
/**
	Objects里面的equals方法-->允许传递null值

    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }



    总结: 只要是重写了Object类中的toString方法,那么直接输出对象名,不是地址值
         只要是重写了Object类中的equals方法,那么比较的不是地址值,而是属性值
*/
public class Test01 {
	public static void main(String[] args) {
		Person01 p1 = new Person01("柳岩", 36);
		Person01 p2 = new Person01("小涛", 30);
		Person01 p3= new Person01("涛哥", 16);
		Person01 p4 = new Person01("涛哥", 16);
		// ArrayList<String> list = new ArrayList<String>();
		System.out.println(p3.equals(p4));
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p2.toString());
		// ArrayList<String> list = new ArrayList<>();
        // System.out.println(list);
		String s ="abc";
		String s1 = "abc";
		String s2 = null;
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		//System.out.println(s2.equals(s1));
		System.out.println("---------------------");
		System.out.println(Objects.equals(s1, s2));
	}
	
}




