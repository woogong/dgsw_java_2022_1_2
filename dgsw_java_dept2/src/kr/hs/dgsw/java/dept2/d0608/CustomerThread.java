package kr.hs.dgsw.java.dept2.d0608;

public class CustomerThread implements Runnable {

	private final String work;
	
	public CustomerThread(String work) {
		this.work = work;
	}
	
	@Override
	public void run() {
		System.out.printf("���� %s ���� �ð���ϴ�. ���� ��ĥ ������ ��ٸ��ϴ�.\n",
				work);
		
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("���� ������ �Ϸ�� ����Ʈ���� ���� �޽��ϴ�..\n");
		
	}
	
	public String getWork() {
		return work;
	}
	
}
