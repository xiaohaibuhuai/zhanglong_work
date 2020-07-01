package day01;

import java.util.ArrayList;

/**
 * 包装类:基本数据类型所对应的引用数据类型

         byte           Byte
         short          Short
         char           Character
         int            Integer
         long           Long
         float          Float
         double         Double
         boolean        Boolean

    拆箱和装箱:
       装箱:将基本的变成对应的包装类
           构造:  new Integer(1)
                 Integer(String s) -->字符串必须是数字的形式  "1"  ["a"]
                 
           valueOf:
           static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
           static Integer valueOf(String s)返回保存指定的 String 的值的 Integer 对象。
           字符串必须是数字的形式  "1"  ["a"]
       拆箱:将包装类变成对应的基本数据类型
            intValue()
 * @author zhanglong
 *
 */
public class Demo01BaoZhuangClass03 {
	public static void main(String[] args) {
		method();
		System.out.println("------------------");
		method01Constructor();
		System.out.println("------------------");
		method01Method();
		System.out.println("------以下是拆箱的方法------");
		method02();
	}
	private static void method02(){
		Integer integer = Integer.valueOf(1);
		int i = integer.intValue();
		System.out.println(i+19);
	}
	private static void method01Method(){
		Integer integer = Integer.valueOf(1);
		System.out.println(integer);
		Integer integer1 = Integer.valueOf("4");
		System.out.println(integer1);
	}
	public static void method01Constructor(){
		Integer integer = new Integer(1);
		System.out.println(integer);
		Integer integer1 = new Integer("2");
		System.out.println(integer1);
	}
	public static void method(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);//装箱
		int integer = list.get(0);//拆箱
	}
}



















