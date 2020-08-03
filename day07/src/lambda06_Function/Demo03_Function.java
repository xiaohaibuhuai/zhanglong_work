package lambda06_Function;

import java.util.function.Function;

import lambda02.Person;

/**
 * 使用Function根据指定的字符串名字变成Person对象,年龄固定
 * @author zhanglong
 *
 */
public class Demo03_Function {
	public static void main(String[] args) {
        method("柳岩", new Function<String, Person>() {
            public Person apply(String s) {
                return new Person(s,36);
            }
        });

        System.out.println("-----最简化Lambda表达式-----");

        method("中浪",s -> new Person(s,50));
    }

    public static void method(String name, Function<String,Person> function){
        Person person = function.apply(name);
        System.out.println(person);
    }
}
