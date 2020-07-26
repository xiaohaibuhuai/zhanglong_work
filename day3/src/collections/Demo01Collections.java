package collections;
/**
 * 工具类:Collections
   概述:是一个Java给的工具类   
   位置:java.util.Collections
   特点:方法都是静态的
   使用方式:类型直接调用
   方法:
      public static void shuffle(List<?> list):打乱集合顺序。
      public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
                                                  针对于数字:升序
                                                  针对于字母:按照字典顺序,如果前面有大写,先按照大写的顺序排
      public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Demo01Collections {
	public static void main(String[] args) {
        method01();
        System.out.println("-------------------");
        method02();
        System.out.println("----------------------");

        method03();

    }

    public static void method03() {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("涛哥",16));
        list.add(new Person("孝艳",15));
        list.add(new Person("保华",50));
        //Collections.sort(list,new Rule());
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);

    }

    public static void method02() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void method01() {
        //public static void shuffle(List<?> list):打乱集合顺序。

        //创建集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("金莲");
        list.add("王婆");
        list.add("西门大官人");
        list.add("大郎");

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        /*HashSet<String> hashSet = new HashSet<>();
        Collections.shuffle(hashSet);*/
    }
}
