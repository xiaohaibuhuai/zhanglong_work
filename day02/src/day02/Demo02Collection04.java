package day02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection:单列集合的顶级接口
             使用:
                1.通过new 实现类来创建对象
                2.调用方法
                 public boolean add(E e)：  把给定的对象添加到当前集合中 。
                 public void clear() :清空集合中所有的元素。
                 public boolean remove(E e): 把给定的对象在当前集合中删除。
                 public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
                 public boolean isEmpty(): 判断当前集合是否为空。
                 public int size(): 返回集合中元素的个数。
                 public Object[] toArray(): 把集合中的元素，存储到数组中
 * @author zhanglong
 *
 */
public class Demo02Collection04 {
	public static void main(String[] args) {
        //利用多态的形式去创建集合对象
        Collection<String> coll = new ArrayList<>();
        coll.add("金莲");
        coll.add("大郎");
        coll.add("小叔");
        coll.add("大官人");
        coll.add("王婆");

        System.out.println(coll);

        boolean remove = coll.remove("王婆");
        System.out.println(remove);
        System.out.println(coll);

        boolean result = coll.contains("大郎");
        System.out.println(result);

        boolean empty = coll.isEmpty();
        System.out.println(empty);

        int size = coll.size();
        System.out.println(size);

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
