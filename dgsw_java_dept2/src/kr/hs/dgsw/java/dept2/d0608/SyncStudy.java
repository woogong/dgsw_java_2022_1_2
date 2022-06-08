package kr.hs.dgsw.java.dept2.d0608;

public class SyncStudy {

	public static Object obj = new Object();
	
	public static class Waiter implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Waiter �����尡 �����մϴ�.");
			
			synchronized (obj) {
				try {
					System.out.println("Waiter �����尡 ������ �ߴ��մϴ�.");
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("Waiter �����尡 ������ �簳 �մϴ�.");
		}
	}

	public static void main(String[] args) throws Exception {
		
		new Thread(new Waiter()).start();
		
		
		Thread.sleep(5000);
		
		synchronized (obj) {
			obj.notify();
		}
		
	}
	
	
}
