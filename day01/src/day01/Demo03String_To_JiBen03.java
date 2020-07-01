package day01;
/**
 * 基本数据类型和String之间相互转换
   基本数据类型变成String-->和String拼接
   将String 变成 基本数据类型
   parsexxx(String s)-->都是静态的,可以类名直接调用
   参数也必须数字的形式
 * @author zhanglong
 *
 */
public class Demo03String_To_JiBen03 {
	public static void main(String[] args) {
		int i = 10;
		String s = i+""+10;
		System.out.println(s);
		System.out.println("----------------");
		int i1 = Integer.parseInt("1");
		System.out.println(i1+10);
	}
}
