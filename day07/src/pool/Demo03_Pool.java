package pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 利用Callable接口去完成
        1-100的和
        1-200的和

    Callable接口中的call方法有返回值,抛了Exception,所以便于我们获取线程任务的值以及其子类重写call方法的时候可以随便抛异常

    Runnable接口中的run方法没有返回值,没有抛异常,我们无法获取run方法中的值,以及其子类重写run方法的时候不可以随便抛异常
 * @author zhanglong
 *
 */
public class Demo03_Pool {
	public static void main(String[] args) throws ExecutionException, InterruptedException{
		//获取线程池
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> future = executorService.submit(new MyCallable(100));
		System.out.println(future.get());
		Future<Integer> future1 = executorService.submit(new MyCallable(200));
        System.out.println(future1.get());
	}
}
