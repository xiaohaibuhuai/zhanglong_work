package thread;

public class Demo02_Main {
	public static void main(String[] args) {
		//创建线程类对象
		MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main线程");
        }
	}
}
