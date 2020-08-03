package lambda05_Consumer;

import java.util.function.Consumer;

/**
 * Consumer<T>:消费型接口

       void accept(T t):消费一个指定泛型的数据

            给我什么类型的数据,我们就操作什么类型的数据

 * @author zhanglong
 *
 */
public class Demo01_Consumer {
	public static void main(String[] args) {
        method("孙悟空是个猴儿", new Consumer <String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        });

        System.out.println("------标准的Lambda表达式-----");
        method("涛哥是世界上第一帅的人",(String s)->{System.out.println(s.length());});

        System.out.println("------简化的Lambda表达式-----");

        method("保华是世界上第二十帅的人",s-> System.out.println(s.length()));

    }
    public static void method(String s, Consumer<String> consumer){
        consumer.accept(s);
    }
}
