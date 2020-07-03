package day02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 范型的好处:将元素类型规定死了,不会出现ClassCastException这种问题
 * 如果不使用泛型的话,我什么类型都可以存,如果我们遍历的过程中,想操作字符串,那么我们就得向下转型 ,
 * 将object转成String
   但是,如果下面有其他类型的元素,那么我们再向下转型成String的话,就报错:ClassCastException

 * @author zhanglong
 *
 */
public class Demo02Fanxing05 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("孝艳");
		System.out.println(list);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Object element = iterator.next();
			System.out.println(element);
		} 
		ArrayList<String> list1 = new ArrayList();
	}
}
