package Pk2;

public class ThreadDemo extends Thread{
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		t1.setName("ThreadOne");
		t2.setName("ThreadSecond");
		//t1.start();
		t2.start();
		t2.setPriority(MAX_PRIORITY);
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		t1.start();
	}
	
}
