package exception01;

import java.io.FileNotFoundException;

/**
 * try{
      将要出现异常的代码
   }catch(异常对象 变量名){
      处理异常
   }finally{
      必须要执行的代码
   }
   
   finally-->用于关闭资源
 * @author zhanglong
 *
 */
public class Demo08_Exception {
	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			method(0);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally{
			//System.exit(0);退出jvm
			System.out.println("别管老子,老子就是要执行,来吧,老弟");
		}
		System.out.println("宝瑞没对象~~~他每天都new一个");
	}

	public static void method(int n) throws FileNotFoundException {		
		if (n==0){
			throw new FileNotFoundException("来啦，老弟，好嗨！");
		}
		System.out.println("我要执行了～～");
	}
}
