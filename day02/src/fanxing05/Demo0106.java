package fanxing05;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 泛型的通配符:不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配
 * @author zhanglong
 *
 */
public class Demo0106 {
	public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("孝艳");
        collection.add("珊珊");
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(36);
        method(collection);
        method(collection1);
    }
    public static void method(Collection<?> collection){
        //遍历上面传递过来的集合
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
