package kr.hs.dgsw.java.dept2.d0525;

public class Bts implements Job {

	@Override
	public void work() {
		System.out.println("BTS�� ���߰� �뷡�ϸ� ������� �ູ�ϰ� ����ϴ�.");
	}
	
	@Override
	public int getPrice() {
		return 12460000;
	}
}
