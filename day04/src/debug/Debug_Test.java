package debug;
/**
 * F8:代码逐行执行
   F7:直接进入所调用的方法内部
   shift+F8:跳出该方法
   F9:如果有多个断点,那么就会跳到下一个断点的地方,如果下面没有断点了,直接将代码全部执行完
 * @author zhanglong
 *
 */
public class Debug_Test {
	public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int sum = i+j;
        System.out.println(sum);

        int[] arr = method();
        System.out.println(arr.length);
    }

    public static int[] method() {
        int[] arr = {1,2,3,4,5};
        return arr;
    }
}
