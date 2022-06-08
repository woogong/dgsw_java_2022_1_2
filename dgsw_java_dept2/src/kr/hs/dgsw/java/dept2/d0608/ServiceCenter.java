package kr.hs.dgsw.java.dept2.d0608;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceCenter {
	
	public static final int COUNT_ENGINEERS = 1;
	
	private final Queue<CustomerThread> workQueue = new LinkedList<CustomerThread>();
	
	public void prepareEngineers() {
		for (int i = 0 ; i < COUNT_ENGINEERS ; i++) {
			EngineerThread engineer = new EngineerThread(this, i);
			new Thread(engineer).start();
		}
	}
	
	public void acceptRequirement(CustomerThread customer) {
		workQueue.add(customer);
		
		synchronized (this) {
			this.notify();
		}
	}
	
	public CustomerThread getWork() {
		return workQueue.poll();
	}
	
	public static void main(String[] args) throws Exception {
		ServiceCenter serviceCenter = new ServiceCenter();
		serviceCenter.prepareEngineers();
		
		Thread.sleep(1000);
		CustomerThread customer1 = new CustomerThread("������ �ȵ˴ϴ�.");
		new Thread(customer1).start();
		
		serviceCenter.acceptRequirement(customer1);
		
		Thread.sleep(500);
		CustomerThread customer2 = new CustomerThread("������ �������.");
		new Thread(customer2).start();
		
		serviceCenter.acceptRequirement(customer2);
		
		
		
	}
	
}
