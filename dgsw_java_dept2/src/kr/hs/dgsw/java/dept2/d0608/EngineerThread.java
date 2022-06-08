package kr.hs.dgsw.java.dept2.d0608;

public class EngineerThread implements Runnable {

	private final ServiceCenter serviceCenter;
	
	private final int id;
	
	public EngineerThread(ServiceCenter serviceCenter,
			int id) {
		this.serviceCenter = serviceCenter;
		this.id = id;
	}
	
	@Override
	public void run() {
		while (true) {
			String work = serviceCenter.getWork();
			
			if (work != null) {
				System.out.printf("%d ������ �۾� ���� : %s\n",id, work);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.printf("%d ������ �۾� ����\n", id);
			} else {
				synchronized (serviceCenter) {
					try {
						System.out.printf("%d ������ �޽� ��\n", id);
						serviceCenter.wait();
						System.out.printf("%d ������ �۾� �簳\n", id);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}
