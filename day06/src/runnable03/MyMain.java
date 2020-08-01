package runnable03;

public class MyMain {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		new Thread(ticket).start();
        new Thread(ticket).start();
        new Thread(ticket).start();
	}
}
