package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet implements Set

     特点:
        1.无序
        2.元素不可重复
        3.没有索引(只能用迭代器和增强for)
 * @author zhanglong
 *
 */
public class Demo01_HashSet {
	public static void main(String[] args) {
		//创建集合
		HashSet<String> hashSet = new HashSet<String>();
		//添加元素
		hashSet.add("洪七公");
		hashSet.add("欧阳锋");
		hashSet.add("王重阳");
		hashSet.add("黄老邪");
		hashSet.add("黄老邪");
		//遍历
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		for (String s : hashSet){
			System.out.println(s);
		}
	}
}
