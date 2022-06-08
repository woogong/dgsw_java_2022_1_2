package kr.hs.dgsw.java.dept2.d0608;

public class DepositThread implements Runnable {

	private final Bank bank;
	private final String name;
	private final int amount;
	
	
	public DepositThread(Bank bank, String name, int amount) {
		this.bank = bank;
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		bank.deposit(name, amount);
	}

}
