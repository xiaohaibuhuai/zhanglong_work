package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 演示打乱集合中的元素
   Collections.shuffle(List<?> list)
 * @author zhanglong
 *
 */
public class Demo006 {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("孝艳");
        list.add("珊珊");
        list.add("涛哥");
        list.add("保华");
        list.add("柳岩");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
