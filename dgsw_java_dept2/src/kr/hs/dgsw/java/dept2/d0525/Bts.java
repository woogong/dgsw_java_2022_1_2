package kr.hs.dgsw.java.dept2.d0525;

public class Bts implements Job {

	@Override
	public void work() {
		System.out.println("BTS는 춤추고 노래하며 사람들을 행복하게 만듭니다.");
	}
	
	@Override
	public int getPrice() {
		return 12460000;
	}
}
