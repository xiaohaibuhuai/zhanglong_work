package thread;
/**
 * 创建线程的方式1:
      1.创建一个类 继承Thread类
      2.重写run方法,方法体中写我们要执行的任务
      3.创建线程类对象,调用start方法
 * @author zhanglong
 *
 */
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("造的线程");
        }
    }
}
