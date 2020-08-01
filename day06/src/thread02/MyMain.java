package thread02;

public class MyMain {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread("宝瑞");
		//myThread.setName("狗剩");
		myThread.start();
		
		//Thread thread = new Thread();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"..."+i);
		}
	}
}
