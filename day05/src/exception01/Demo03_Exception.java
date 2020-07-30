package exception01;
/**
 * 自己创建异常对象

         throw new 异常对象:写在方法里面

    异常处理方式1:throws
         格式:
            throws 异常类
         位置:方法的声明上

    throws处理多个异常对象
         throws 异常对象,异常对象
 * @author zhanglong
 *
 */
public class Demo03_Exception {
	public static void main(String[] args)throws Exception {
        //int[] arr = {};

        int[] arr = {};
        method(arr);
    }

    public static void method(int[] arr)throws Exception{
        if (arr.length==0){
           // throw new Exception();
            throw new IndexOutOfBoundsException("哥们,你的数组长度为0啦");
        }

        if (arr==null){
            //throw new Exception();
            throw new NullPointerException("哥们,你为null啦");
        }
        /*System.out.println(arr[0]);*/
        System.out.println("我要执行");
    }
}
