package runnable06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock:接口

   lock():获取锁
   unlock():释放锁
 * @author zhanglong
 *
 */
public class Ticket implements Runnable{
	static int ticket = 100;
	//Object object = new Dbject();
	Lock lock = new ReentrantLock();
	public void run (){
		while(true){
			lock.lock();
			if(ticket > 0){
				try {
					Thread.sleep(10L);
					System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                    ticket--;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					//释放锁
					lock.unlock();
				}
			}
		}
	}
}
