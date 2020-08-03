package lambda07_predicate;

import java.util.function.Predicate;

/**
 * Predicate<T>  其他默认方法

      and       &&    有假则假
      or        ||    有真则真
      negate    !     取反


      判断字符串长度是不是大于5
      判断字符串是否包含H
 * @author zhanglong
 *
 */
public class Demo02_Predicate {
	public static void main(String[] args) {
        method("HelloWorld", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 5;
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("H");
            }
        });

        System.out.println("-----最简单Lambda表达式-----");
        method("HelloWorld",s -> s.length()<5,s -> s.contains("H"));

        System.out.println("-------------------以下是or方法----------------------");

        method01("baohua",s -> s.length()>5,s -> s.contains("H"));


        System.out.println("-------------------以下是negate方法----------------------");

        method02("zhonglang",s -> s.length()!=5);
    }

    public static void method(String s, Predicate<String> predicate1,Predicate<String> predicate2){
        boolean result1 = predicate1.test(s);
        boolean result2 = predicate2.test(s);

        /*if (result1 && result2){
            System.out.println("我要出来了");
        }*/

        boolean test = predicate1.and(predicate2).test(s);
        System.out.println(test);

    }

    public static void method01(String s, Predicate<String> predicate1,Predicate<String> predicate2){
        boolean result1 = predicate1.test(s);
        boolean result2 = predicate2.test(s);

       /* if (result1 || result2){
            System.out.println("我要出来了");
        }*/


        boolean test = predicate1.or(predicate2).test(s);
        System.out.println(test);


    }

    public static void method02(String s, Predicate<String> predicate1){
       /* boolean test = predicate1.test(s);
        System.out.println(!test);*/

        boolean test = predicate1.negate().test(s);
        System.out.println(test);
    }

}
