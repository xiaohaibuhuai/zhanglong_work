package day02;

import java.util.ArrayList;

/**
 * 范型的介绍
 * 范型：可以规定具体的类型
 * 啥时候用定义范型：当我们不确定传递什么类型的数据的时候
 * @author zhanglong
 *
 */
public class Demo01FanXing05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("");
		String s = list.get(0);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
	}

}
