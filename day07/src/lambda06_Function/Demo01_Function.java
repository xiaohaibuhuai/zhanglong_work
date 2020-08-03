package lambda06_Function;

import java.util.function.Function;

/**
 * java.util.function.Function<T,R>:专门用于数据类型之间的相互转换

     方法:
        R apply(T t):根据类型T的参数获取类型R的结果

     需求:将Integer转成String,并拼接
 * @author zhanglong
 *
 */
public class Demo01_Function {
	public static void main(String[] args) {
        method(1, new Function<Integer, String>() {
            public String apply(Integer integer) {
                return integer+"";
            }
        });

        System.out.println("--------标准的Lambda表达式------");

        method(1,(Integer i)->{return i+"";});

        System.out.println("--------简化的Lambda表达式------");

        method(2,integer -> integer+"");
    }

    public static void method(Integer integer, Function<Integer,String> function){
       String result =  function.apply(integer);
       System.out.println(result+"孝艳是世界上最美的人~~~~");
    }
}
