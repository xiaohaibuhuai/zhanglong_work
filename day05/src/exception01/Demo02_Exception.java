package exception01;
/**
 * 异常出现的过程
 * @author zhanglong
 *
 */
public class Demo02_Exception {
	public static void main(String[] args) {
        int[] arr = {1,2};
        int element = method(arr);
        System.out.println(element);
    }

    public static int method(int[] arr) {
        int ele = arr[3];

        return ele;
    }
}
