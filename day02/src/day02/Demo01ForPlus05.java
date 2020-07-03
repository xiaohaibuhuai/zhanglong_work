package day02;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

/**
 * 增强for:用于遍历集合
      比普通for更屌的for循环
      根据我们集合的层级关系来看,只要是跟Iterable接口有关的集合,都可以用增强for
      格式:
         for(集合中元素的数据类型 变量名:集合名或者数组名){
              sout(变量名)
         }
      增强for底层实现原理,是迭代器
 * @author zhanglong
 *
 */
public class Demo01ForPlus05 {
	public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("明步");
        collection.add("海翼");
        collection.add("安住");
        collection.add("波多");
        collection.add("波多");
        collection.add("小泽");
        collection.add("未久");
        System.out.println(collection);
        //使用迭代器
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------以下是增强for循环的使用-----------");
        for (String element:collection){
            System.out.println(element);
        }
        for (String s : collection) {
            System.out.println(s);
        }
        method();
    }
    public static void method(){
        int[] arr ={1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
