package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张无忌",18));
        list.add(new Person("张三丰",180));
        list.add(new Person("张翠山",48));

        //排序
        //Collections.sort(list);
        System.out.println(list); 
    }
}
