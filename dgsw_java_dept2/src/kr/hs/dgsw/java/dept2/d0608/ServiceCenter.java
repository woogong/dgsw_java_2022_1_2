package kr.hs.dgsw.java.dept2.d0608;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceCenter {
	
	public static final int COUNT_ENGINEERS = 1;
	
	private final Queue<String> workQueue = new LinkedList<String>();
	
	public void prepareEngineers() {
		for (int i = 0 ; i < COUNT_ENGINEERS ; i++) {
			EngineerThread engineer = new EngineerThread(this, i);
			new Thread(engineer).start();
		}
	}
	
	public void acceptRequirement(String problem) {
		workQueue.add(problem);
		
		synchronized (this) {
			this.notify();
		}
	}
	
	public String getWork() {
		return workQueue.poll();
	}
	
	public static void main(String[] args) throws Exception {
		ServiceCenter serviceCenter = new ServiceCenter();
		serviceCenter.prepareEngineers();
		
		Thread.sleep(1000);
		CustomerThread customer1 = new CustomerThread("충전이 안됩니다.");
		new Thread(customer1).start();
		
		
		
	}
	
}
