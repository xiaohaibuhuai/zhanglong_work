package lambda04_Supplier;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Supplier<T> 供给型的接口

    T get()--> 用来获取一个泛型参数指定类型的对象数据。

          Supplier使用的时候泛型给什么类型,那么我们get到的就是什么类型的数据

 * @author zhanglong
 *
 */
public class Demo01_Supplier {
	public static void main(String[] args) {
        //创建一个数组
        int[] arr = {2,1,4,3};

        //获取数组最大值
        method(new Supplier<Integer>() {
            @Override
            public Integer get() {
                Arrays.sort(arr);
                return arr[arr.length-1];
            }
        });

        System.out.println("------标准Lambda表达式----");

        method(()->{ Arrays.sort(arr);return arr[arr.length-1];});

        //获取最小值
        method(new Supplier<Integer>() {
            public Integer get() {
                return arr[0];
            }
        });

        System.out.println("------标准Lambda表达式----");

        method(()->{ return arr[0];});

        System.out.println("------最简Lambda表达式----");
        method(()->arr[0]);
    }

    public static void method(Supplier<Integer> supplier){
        Integer integer = supplier.get();
        System.out.println(integer);

    }
}
