package lambda02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Lambda表达式的省略规则
         1.方法中的参数类型可以省略
         2.如果方法的参数中有且只有一个参数,那么参数的小括号可以省略
         3.如果方法体中有且只有一条语句,大括号    如果是有return   语句的分号都可以省略(要不就全省,要不就全不省略
 * @author zhanglong
 *
 */
public class Demo02_Lambda {
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

        System.out.println("-------------Lambda标准写法--------------");
        Collections.sort(list,(Person o1, Person o2)->{ return o2.getAge()-o1.getAge();});
        System.out.println(list);

        System.out.println("---------利用Lambda表达式去完成最简化形式---------");

        Collections.sort(list,(o1,o2)->o1.getAge()-o2.getAge());
    }
}
