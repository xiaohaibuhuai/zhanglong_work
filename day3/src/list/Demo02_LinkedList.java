package list;

import java.util.LinkedList;
/**
 * java.util.LinkedList implements List

    特点:
       1.有序
       2.有索引
       3.允许出现重复元素
       4.此实现不是同步的,速度快,不安全

    方法:
       public void addFirst(E e):将指定元素插入此列表的开头。
       public void addLast(E e):将指定元素添加到此列表的结尾。
       public E getFirst():返回此列表的第一个元素。
       public E getLast():返回此列表的最后一个元素。
       public E removeFirst():移除并返回此列表的第一个元素。
       public E removeLast():移除并返回此列表的最后一个元素。
       public E pop():从此列表所表示的堆栈处弹出一个元素。
       public void push(E e):将元素推入此列表所表示的堆栈。
       public boolean isEmpty()：如果列表不包含元素，则返回true。
 * @author zhanglong
 *
 */
public class Demo02_LinkedList {
	public static void main(String[] args) {
        //创建集合
        LinkedList<String> list = new LinkedList<>();
        list.add("涛哥");
        list.add("柳岩");
        list.add("孝艳");

        list.add("安住");
        list.add("安住");
        System.out.println(list);

        //addFirst(E e):将指定元素插入此列表的开头。
       /* list.addFirst("保华");
        System.out.println(list);*/
        list.addLast("孙悟空");
        //addLast(E e):将指定元素添加到此列表的结尾。

        System.out.println(list);

        //removeFirst():移除并返回此列表的第一个元素。
       /* String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);
        */
        //public E removeLast():移除并返回此列表的最后一个元素。
        /*String s1 = list.removeLast();
        System.out.println(s1);
        System.out.println(list);*/

        /*
          public E pop():从此列表所表示的堆栈处弹出一个元素。
          public void push(E e):将元素推入此列表所表示的堆栈。
         */

       /* String pop = list.pop();
        System.out.println(pop);
        System.out.println(list);*/

        list.push("宋江");
        System.out.println(list);
    }
}
