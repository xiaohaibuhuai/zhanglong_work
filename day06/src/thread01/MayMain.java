package thread01;

public class MayMain {
	public static void main(String[] args) {
		//创建线程类对象
		MyThread myThread = new MyThread();
		myThread.start();
		
		MyThread myThread1 = new MyThread();
        myThread1.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main..."+i);
        }
	}
}
