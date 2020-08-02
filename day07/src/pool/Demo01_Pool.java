package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 顶级接口是 Executors

   方法:public static ExecutorService newFixedThreadPool(int nThreads)

       ExecutorService:代表的是真正的线程池
       newFixedThreadPool:获取线程池
       int nThreads:执行线程池中的线程数量

       public Future<?> submit(Runnable task):获取线程池中的某一个线程对象，并执行,提交任务
 * @author zhanglong
 *
 */
public class Demo01_Pool {
	public static void main(String[] args) {
		//获取线程池对象
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(new Runnable() {
			public void run() {
				System.out.println("任务1执行了："+Thread.currentThread().getName());
			}
		});
		executorService.submit(new Runnable() {
			public void run() {
				System.out.println("任务2执行了："+Thread.currentThread().getName());
			}
		});
		executorService.submit(new Runnable() {
			public void run() {
				System.out.println("任务3执行了："+Thread.currentThread().getName());
			}
		});
		executorService.shutdown();
	}
}
