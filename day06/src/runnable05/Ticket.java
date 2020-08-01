package runnable05;
/**
 * 如何保证我们的线程安全:
       上锁(同步):一定要是同一把锁对象

       同步:
          同步代码块

            格式:synchronized(任意对象){}

          同步方法

             普通的:有锁, this
                 修饰符 synchronized 返回值类型 方法名(参数){
                     方法体-->线程任务
                 }

             静态的:有锁  ,当前类.class
                 修饰符  static synchronized 返回值类型 方法名(参数){
                     方法体-->线程任务
                 }
 * @author zhanglong
 *
 */
public class Ticket implements Runnable{
	static int ticket = 100;
    Object object = new Object();

    public void run() {
        while(true){
            method01();
        }

    }
  //定义一个同步方法
    /*public synchronized void method(){
        if (ticket>0){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
            ticket--;
        }
    }*/

   /* public void method() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                ticket--;
            }
        }
    }*/

    //定义一个静态的同步方法
   /* public static synchronized void method01(){
        if (ticket>0){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
            ticket--;
        }
    }*/
    public static  void method01(){
        synchronized (Ticket.class){
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
