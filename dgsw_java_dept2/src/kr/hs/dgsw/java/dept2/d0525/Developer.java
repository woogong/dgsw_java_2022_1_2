package kr.hs.dgsw.java.dept2.d0525;

public class Developer implements Job {

	@Override
	public void work() {
		System.out.println("���α׷� �����ڰ� ������ ���α׷����� �մϴ�.");
	}
	
	@Override
	public int getPrice() {
		return 100000;
	}
}
