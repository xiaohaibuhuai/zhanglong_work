package lambda06_Function;

import java.util.function.Function;

/**
 * Function接口中的默认方法
      andThen:一步接一步   将两种转换合起来使用

      需求:
          String变成Integer
          将转成的Integer变成String
 * @author zhanglong
 *
 */
public class Demo02_Function {
	public static void main(String[] args) {
        method("111", new Function<String, Integer>() {
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, new Function<Integer, String>() {
            public String apply(Integer integer) {
                return integer+"";
            }
        });

        System.out.println("-----标准Lambda表达式----");

        method("222",(String s)->{return Integer.parseInt(s);},(Integer i)->{ return i+"";});

        System.out.println("-----简化Lambda表达式----");
        method("333",s->Integer.parseInt(s),integer->integer+"");
    }
    public static void method(String s, Function<String,Integer> function1,Function<Integer,String> function2){
       /* Integer i = function1.apply(s);
        String apply = function2.apply(i);
        System.out.println(apply+"hahaha");*/

        String apply = function1.andThen(function2).apply(s);
        System.out.println(apply+"教室要爆炸,不许跑,等死");
    }
}
