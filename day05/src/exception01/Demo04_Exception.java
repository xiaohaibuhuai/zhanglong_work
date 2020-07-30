package exception01;

import java.util.Objects;

/**
 * Objects中的非空判断方法
      public static <T> T requireNonNull(T obj) {
        if (obj == null)
      	   throw new NullPointerException();
        return obj;
}
 * @author zhanglong
 *
 */
public class Demo04_Exception {
	public static void main(String[] args)throws Exception {
        //int[] arr = {};

        int[] arr = null;
        method(arr);
    }

    public static void method(int[] arr)throws Exception{
        if (arr.length==0){
           // throw new Exception();
            throw new IndexOutOfBoundsException("哥们,你的数组长度为0啦");
        }

        /*if (arr==null){
            //throw new Exception();
            throw new NullPointerException("哥们,你为null啦");
        }*/
        Objects.requireNonNull(arr);
        /*System.out.println(arr[0]);*/
        System.out.println("我要执行");
    }
}
