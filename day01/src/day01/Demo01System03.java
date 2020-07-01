package day01;

import java.util.Arrays;

/**
 * java.lang.System

     特点:类中有大量的静态方法
     方法:
     public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
     public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
     将数组中指定的数据拷贝到另一个数组中。
     src:代表的是源数组
     srcPos:从原数组的第几个索引开始复制
     dest:代表的是目标数组
     destPos:代表的是从目标数组的第几个索引开始复制
     length:复制多少个
 * @author zhanglong
 *
 */
public class Demo01System03 {
	public static void main(String[] args) {
		//创建数组
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = {7,8,9,10,11,12,13};
		System.arraycopy(arr,1,arr1,2,3);
		System.out.println(Arrays.toString(arr1));
	}
}
