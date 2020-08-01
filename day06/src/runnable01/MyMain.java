package runnable01;
/**
 * 为什么常用的是第二种创建线程的方式
        1.避免了继承的局限性
        2.能够降低耦合度(高内聚,低耦合)
 * @author zhanglong
 *
 */
public class MyMain {
	public static void main(String[] args) {
		//创建对象
		//MyRunnable myRunnable = new MyRunnable();
		//创建Thread对象，传递我们的myRunnable对象
		//Thread thread = new Thread(myRunnable);
		//thread.start();
		new Thread(new MyRunnable()).start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
			
		}
	}
}
