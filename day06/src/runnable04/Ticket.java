package runnable04;
/**
 * 如何保证我们的线程安全:
       上锁(同步):一定要是同一把锁对象

       同步:
          同步代码块

            格式:synchronized(任意对象){}

 * @author zhanglong
 *
 */
public class Ticket implements Runnable{
	int ticket = 100;
	Object object = new Object();
	@Override
	public void run() {
		  while(true){
	            synchronized (object){
	                if (ticket>0){
	                    try {
	                        Thread.sleep(100L);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
	                    ticket--;
	                }
	            }

	        } 
	}

}
