package day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator:接口
     作用:可以遍历集合

     怎么获取?
        Iterator<E> iterator()

     方法:
        hasNext()-->判断集合中有没有下一个元素
        next()-->取下一个元素
 * @author zhanglong
 *
 */
public class Demo01Iterator04 {
	public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("珊珊");
        collection.add("涛哥");
        collection.add("保华");
        collection.add("孝艳");
        collection.add("晓亭");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
