package lambda02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01_Lambda {
	public static void main(String[] args) {
        //创建集合
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("猪八戒",45));
        list.add(new Person("孙悟空",50));
        list.add(new Person("沉香",20));

        Collections.sort(list, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(list);

        System.out.println("--------利用Lambda表达式去改造有参数有返回值的方法------");

        Collections.sort(list,(Person o1, Person o2)->{ return o2.getAge()-o1.getAge();});
        System.out.println(list);

        System.out.println("---------利用Lambda表达式去完成最简化形式---------");

        Collections.sort(list,(o1, o2)-> o1.getAge()-o2.getAge());
        System.out.println(list);


    }
}
