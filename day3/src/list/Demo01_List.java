package list;

import java.util.ArrayList;
import java.util.List;
/**
 * java.util.List extends Collection

    特点:
       1.元素允许重复
       2.有序(存进去的顺序和取出来的顺序一样)
       3.有索引(可以用普通for来遍历)

    方法:
       public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
       public E get(int index):返回集合中指定位置的元素。
       public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
       public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

 * @author zhanglong
 *
 */
public class Demo01_List {
	public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("岳不群");
        list.add("林平之");
        list.add("东方不败");
        list.add("令狐冲");
        list.add("令狐冲");
        System.out.println(list);

        list.add(2,"保华");
        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);

        list.set(3,"涛哥");
        System.out.println(list);
    }
}
