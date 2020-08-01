package thread02;
/**
 * String getName():获取线程的名称
   static Thread currentThread():获取当前正在运行的线程类对象
                                 在哪个线程类中获取,那么获取的就是哪个线程类对象

   void setName(String name):给线程设置名字

   static void sleep(long millis)  -->睡觉 传递一个毫秒值,如果超时,那么线程会继续执行
 * @author zhanglong
 *
 */
public class MyThread extends Thread{
	public MyThread(String name) {
        super(name);
    }
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"..."+i);
		}
	}
}
