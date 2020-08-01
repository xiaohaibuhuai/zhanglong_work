package runnable02;
/**
 * 利用匿名内部类的形式去实现多线程

       new 父类/接口(){
           重写方法
       }.重写的方法

       父类/接口名 = new 父类/接口(){
           重写方法
       };

       名字.重写的方法
 * @author zhanglong
 *
 */
public class MyThread {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("thread0..."+i);
				}
			}
		}).start();
		
		/*new Thread(()-> {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread0..."+i);
        }

		}).start();*/
		
		Thread thread = new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println("thread0..."+i);
				}
			}
		}); 
		thread.start();
		for (int i = 0; i < 10; i++) {
			  System.out.println("main..."+i);
		}
	}
}
