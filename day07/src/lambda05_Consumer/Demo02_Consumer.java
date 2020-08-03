package lambda05_Consumer;

import java.util.function.Consumer;

/**
 * Consumer中的默认方法:
     andThen:一步接一步 -->将2种操作指定数据的动作连在一起

     需求:求指定字符串的长度以及将字符串变成大写
 * @author zhanglong
 *
 */
public class Demo02_Consumer {
	public static void main(String[] args) {
        method("abcde", new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s.length());
            }
        }, new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        System.out.println("----标准Lambda表达式---");

        method("abcdef",(String s)->{System.out.println(s.length());},
                (String s)->{System.out.println(s.toUpperCase());});

        System.out.println("----简化Lambda表达式---");
        method("abcdefg",s -> System.out.println(s.length()),s -> System.out.println(s.toUpperCase()));
    }

    public static void method(String s, Consumer<String> consumer1,Consumer<String> consumer2){
       /* consumer1.accept(s);
        consumer2.accept(s);*/

       consumer1.andThen(consumer2).accept(s);
    }
}
