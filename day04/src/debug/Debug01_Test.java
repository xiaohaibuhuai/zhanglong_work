package debug;
/**
 * 错误代码的debug
 * @author zhanglong
 *
 */
public class Debug01_Test {
	public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        method(arr);
    }

    private static void method(int[] arr) {
        for (int i = 0; i <=arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
