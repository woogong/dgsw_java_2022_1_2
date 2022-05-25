package kr.hs.dgsw.java.dept2.d0525;

import java.util.Random;

public class Join {

	public static class ChildThread implements Runnable {
		@Override
		public void run() {
			System.out.println("�ڽ� �����尡 ���۵Ǿ����ϴ�.");

			try {
				Thread.sleep(new Random().nextInt(3000) + 10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("�ڽ� �����尡 ����Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Thread childThread = new Thread(new ChildThread());
		childThread.start();
		
		System.out.println("�θ� �����尡 �ڽ� �������� ���Ḧ ��ٸ��ϴ�.");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		childThread.interrupt();
		
		/*
		try {
			//childThread.join();
		} catch (InterruptedException e) {}
		*/
		
		System.out.println("�ڽ� �����尡 ������������ �θ� �����尡 ������ �簳�մϴ�.");
	}
	
}
