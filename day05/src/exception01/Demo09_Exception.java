package exception01;

import java.io.FileNotFoundException;

/**
 * 两种异常处理方式的区别:
      throws-->没有具体怎么处理,就一直往上抛,直接抛给jvm来处理

      try..catch-->直接我们自己处理

 * @author zhanglong
 *
 */
public class Demo09_Exception {
	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			method(0);
		} catch (FileNotFoundException e) {
			System.out.println("宝瑞没对象~~~他每天都new一个");
	    }
	}

	public static void method(int n) throws FileNotFoundException {
		if (n==0){
			throw new FileNotFoundException("来啦，老弟，好嗨！");
		}	
		System.out.println("我要执行了");
	}
}
