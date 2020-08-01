package thread01;
/**
 * 步骤:
      1.继承线程类Thread
      2.重写run方法-->设置的线程任务
      3.创建线程类对象
      4.调用start方法(开启线程,并执行线程任务)

      为什么要继承Thread类去实现多线程
          因为Thread类中的run方法是已经确定好的,我们是无法改变的,所以我们不能够自己设置自己想要的线程任务
 * @author zhanglong
 *
 */
public class MyThread extends Thread {
	public void run(){
		for (int i = 0; i < 10; i++) {
            System.out.println("MyThread..."+i);
        }
	}
}
