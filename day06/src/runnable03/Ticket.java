package runnable03;

public class Ticket implements Runnable {
	int ticket = 100;

	@Override
	public void run() {
		while (true){
			if (ticket>0){
				try {
					Thread.sleep(100l);
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
				ticket--;
			}
		}		
	}

}
