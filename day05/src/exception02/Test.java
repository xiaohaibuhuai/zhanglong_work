package exception02;

import java.util.Scanner;

public class Test {
	static String [] name = {"柳岩","明步","安住","于涛","孝艳"};
	public static void main(String[] args) /*throws RegisterException */{
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入用户名以注册:");
		String username = sc.next();
		method(username);
	}
	private static void method(String username)/* throws RegisterException*/ {
		//遍历数组,用我们传递过来的字符串去和数组中每一个元素进行对比,如果相等,抛异常,否则注册成功
		for (String s : name){
			if (s.equals(username)){
				throw new RegisterException("大哥,您已经注册过了,用户名已被占用~");
			}
		}
		System.out.println("注册成功～请登录");
	}
}
