package pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo02_Pool {
	public static void main(String[] args) throws ExecutionException, InterruptedException{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> f = executorService.submit(new Callable<Integer>(){
	        public Integer call() {
               return 10 + 20;
			 }
        });
		Integer result = f.get();
        System.out.println(
                result
         );
	}
}
