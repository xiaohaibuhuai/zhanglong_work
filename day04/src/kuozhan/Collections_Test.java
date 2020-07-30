package kuozhan;
/**
 * public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加多个元素。
 */
import java.util.ArrayList;
import java.util.Collections;

public class Collections_Test {
	public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6);
        System.out.println(list);
    }
}
