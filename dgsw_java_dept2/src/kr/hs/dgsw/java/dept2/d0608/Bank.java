package kr.hs.dgsw.java.dept2.d0608;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank {

	private Map<String, Account> accountMap = new HashMap<String, Account>();
	
	/**
	 * ���¸� �����Ѵ�.
	 */
	public Account makeAccount(String name) {
		Account account = new Account();
		account.setName(name);
		account.setBalance(0);
		
		accountMap.put(name, account);
		
		return account;
	}
	
	/**
	 * �Ա��Ѵ�.
	 */
	public void deposit(String name, int amount) {
		System.out.printf("%s ���� %d���� �Ա��մϴ�.\n", name, amount);
		delay();
		
		// ���¸� �����´�.
		Account account = accountMap.get(name);
		delay();
		
		if (account != null) {
			synchronized (account) {
				// �ܰ� Ȯ���Ѵ�.
				long balance = account.getBalance();
				delay();	
				
				// �ܰ� ������Ų��.
				balance = balance + amount;
				delay();
				
				// �ܰ� �����Ѵ�.
				account.setBalance(balance);
			}
		}
		delay();
		System.out.printf("%s ���� �Ա��� �Ϸ�Ǿ����ϴ�.\n", name);
	}
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	private void delay() {
		try {
			Thread.sleep(new Random().nextInt(1000) + 500);
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount("ȫ�浿");
		
		// �Ƹ�����Ʈ ���
		DepositThread arbeit = new DepositThread(bank, "ȫ�浿", 300000);
		new Thread(arbeit).start();

		// �뵷
		DepositThread parent = new DepositThread(bank, "ȫ�浿", 100000);
		new Thread(parent).start();

		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		
		Account account = bank.getAccount("ȫ�浿");
		System.out.printf("%s ���� ���� �ܰ�� %d���Դϴ�.\n", 
				account.getName(), account.getBalance());
	}
	
}





