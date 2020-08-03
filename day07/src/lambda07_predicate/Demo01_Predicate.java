package lambda07_predicate;

import java.util.function.Predicate;

/**
 * java.util.function.Predicate<T>:判断型

      boolean test(T t);:用于做判断的额

      需求:指定一个字符串,判断这个字符串的长度是不是大于5
 * @author zhanglong
 *
 */
public class Demo01_Predicate {
	public static void main(String[] args) {
        method("HelloWorld", new Predicate<String>() {
            public boolean test(String s) {
                return s.length()>5;
            }
        });

        System.out.println("-----标准Lambda表达式-----");
        method("HelloWorld",(String s)->{return s.length()>5;});

        System.out.println("-----简化Lambda表达式-----");
        method("HelloWorld",s -> s.length()>5);
    }

    public static void method(String s, Predicate<String> predicate){
        boolean result = predicate.test(s);
        System.out.println(result);
    }
}
