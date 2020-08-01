package waitandnotify;

import java.util.ArrayList;

public class Wait_Notify {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//创建一个存的线程
		new Thread(new Runnable() {
            public void run() {
                while(true){
                    synchronized (list){
                        if (list.size()!=0){
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        list.add("柳岩");
                        System.out.println(list);

                        //唤醒取的线程
                        list.notify();
                    }
                }
            }
        }).start();
		
		//创建一个取的线程
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    synchronized (list){
                        //如果集合中没有元素
                        if (list.size()==0){
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        //集合有元素
                        list.remove(0);
                        System.out.println(list);

                        //唤醒存的线程
                        list.notify();
                    }
                }
            }
        }).start();
	}
}
