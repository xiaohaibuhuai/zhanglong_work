package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet extends HashSet

     数据结构:
         链表和哈希表

     特点:
        1.不允许出现重复元素
        2.有序
        3.没有索引,不能用普通for去遍历
 * @author zhanglong
 *
 */
public class Demo05_HashSet {
	public static void main(String[] args) {
        //创建LinkedHashSet对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        //添加元素
        linkedHashSet.add("熊二");
        linkedHashSet.add("熊大");
        linkedHashSet.add("光头强");
        linkedHashSet.add("佩奇");
        linkedHashSet.add("佩奇");
        System.out.println(linkedHashSet);

        //遍历
        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------以下是增强for----------");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
